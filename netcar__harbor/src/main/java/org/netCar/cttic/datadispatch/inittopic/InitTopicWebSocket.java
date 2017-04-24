package org.netCar.cttic.datadispatch.inittopic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.netCar.cttic.datadispatch.util.TopicsNameEnum;
import org.netCar.cttic.datadispatch.util.threadpool.NewWebSocketThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class InitTopicWebSocket {
	private static Logger LOG = LoggerFactory.getLogger(InitTopicWebSocket.class);
	
	private String serverBaseUri;

	private String userId;

	private String password;

	public void initWebSocket() {
		try {
			
			RestTemplate restTemplate = new RestTemplate();

			String uri = new StringBuilder("http://").append(serverBaseUri).append("/auth/").append(userId).toString();
			LOG.info("request uri ==> " + uri);
			ResponseEntity<String> res = restTemplate.postForEntity(uri, password, String.class);
			if (res.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("token ==> " + res.getBody());
				
		        LinkedBlockingDeque<Runnable> linkedWorkQueue = new LinkedBlockingDeque<Runnable>();  
		        ExecutorService threadPool = new ThreadPoolExecutor(10,
		                40, //线程池中最大线程数  
		                60, //线程池中线程的最大空闲时间，超过这个时间空闲线程将被回收  
		                TimeUnit.SECONDS,//时间单位  
		                linkedWorkQueue, //下面是采用有界队列和无界队列的区别  
		                new ThreadPoolExecutor.AbortPolicy());  
				//为每一个topics 初始化websocket 
				for (TopicsNameEnum topicsEnum : TopicsNameEnum.values()) {
		            if(topicsEnum.isEnable()){
		            	NewWebSocketThread task = new NewWebSocketThread(topicsEnum.getEnName(),res.getBody(),topicsEnum);  
		                threadPool.execute(task); 
		            }
		        }
			}

		} catch (Exception e) {
			LOG.error("", e);
		}
	}

}
