package org.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.netCar.cttic.datadispatch.model.OTIpcDef;
import org.netCar.cttic.datadispatch.util.WebsocketClientEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.protobuf.InvalidProtocolBufferException;




public class DispatchTest {
	
	private static Logger LOG = LoggerFactory.getLogger(DispatchTest.class);
	
	@Test
	public void test(){
		
		String serverBaseUri = "wyinter07:8081/datadispatch";
		String userId = "340100";
		String password = "340100";
		String topics = "ProvVehGnss";
		String offsetReset = "earliest";
		boolean batch = true;
		boolean compress = true;
		long timeout = 10;
		
		 try {
	            System.out.println("serverBaseUri ==> " + serverBaseUri);
	            System.out.println("userId ==> " + userId);
	            System.out.println("topics ==> " + topics);
	            System.out.println("offsetReset ==> " + offsetReset);
	            System.out.println("batch ==> " + batch);
	            System.out.println("compress ==> " + compress);
	            System.out.println("timeout ==> " + timeout);

	            RestTemplate restTemplate = new RestTemplate();

	            String uri = new StringBuilder("http://").append(serverBaseUri).append("/auth/").append(userId).toString();
	            System.out.println("request uri ==> " + uri);
	            ResponseEntity<String> res = restTemplate.postForEntity(uri, password, String.class);
	            if (res.getStatusCode().equals(HttpStatus.OK)) {
	                System.out.println("token ==> " + res.getBody());

	                final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(
	                    new URI(
	                        new StringBuilder("ws://").append(serverBaseUri).append("/broker/?token=").append(res.getBody())
	                                .append("&topics=").append(topics)
	                                .append("&offset_reset=").append(offsetReset).toString()
	                    ),
	                    message -> {
	                        System.out.println("message length ==> " + message.length);
	                        try {
	                            if (true) {
	                                if (true) {
	                                    System.out.println("==="+ OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().size()+"===");
	                                    if (true) {
	                                        System.out.println(OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().toString());;
	                                    }
	                                }
	                                else {

	                                    System.out.println("==="+ OTIpcDef.OTIpcList.parseFrom(message).getOtpicList().size()+"===");
	                                }
	                            }
	                            else {
	                                System.out.println("==="+ OTIpcDef.OTIpc.parseFrom(message).toString()+"===");
	                            }
	                        } catch (InvalidProtocolBufferException e) {
	                            LOG.error("", e);
	                        }
	                    });

//	                TimeUnit.SECONDS.sleep(2);

//	                clientEndPoint.sendMessage("test");
	                while (!Thread.currentThread().isInterrupted()) {

	                    try {
	                        TimeUnit.SECONDS.sleep(timeout);
	                        clientEndPoint.sendPing("test");
//	                        TimeUnit.MILLISECONDS.sleep(5000);

	                    }
	                    // 一般设计合理的阻塞方法都会响应中断，并抛出InterruptedException异常，需要捕获该异常并中断当前线程
	                    catch (InterruptedException e) {
	                        System.out.println("interrupted from TimeUnit#sleep() ==> " + Thread.currentThread().getName());
	                        Thread.currentThread().interrupt();
	                    }
	                }
	            }


	        } catch (Exception e) {
	            LOG.error("", e);
	        } finally {
	            //WebSocketClientApplication.LATCH.countDown();
	        }
	}
	
	public static byte[] decompress(byte[] data) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            IOUtils.copy(new GZIPInputStream(new ByteArrayInputStream(data)), out);
            byte[] unzip = out.toByteArray();

            System.out.println("Original: " + data.length);
            System.out.println("Decompressed: " + unzip.length);
            return unzip;
        } catch (Exception e) {
            throw new RuntimeException("gunzip data error", e);
        }
    }
		
	
}
	
		
