package org.netCar.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.netCar.service.cttic.ProvCompanyInfoAdapterService;
import org.netCar.service.impl.WebsocketClientEndpoint;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.netCar.vo.TopicsNameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.protobuf.InvalidProtocolBufferException;

public class NewWebSocketThread implements Runnable {  
	
	private static Logger LOG = LoggerFactory.getLogger(NewWebSocketThread.class);
	
	@Autowired
	private ProvCompanyInfoAdapterService  provCompanyInfoAdapterService;
	
	private String serverBaseUri;

	private String offsetReset;

	private long timeout;

	private boolean batch;

	private boolean compress;

	private boolean logMessage;
	
	private String token;
	
	private TopicsNameEnum topicsEnum;
	
	
    public NewWebSocketThread( String token, TopicsNameEnum topicsEnum,
    		String serverBaseUri,String offsetReset,long timeout,boolean batch,boolean compress,
    		boolean logMessage) {  
        this.token = token;  
        this.topicsEnum = topicsEnum;
        this.serverBaseUri = serverBaseUri;
        this.offsetReset = offsetReset;
        this.timeout = timeout;
        this.batch = batch;
        this.compress = compress;
        this.logMessage = logMessage;
    }  
  
    @Override  
    public void run() {  
    	
    	LOG.info("serverBaseUri ==> " + serverBaseUri);
		LOG.info("topics ==> " + topicsEnum.getTopics());
		LOG.info("offsetReset ==> " + offsetReset);
		LOG.info("batch ==> " + batch);
		LOG.info("compress ==> " + compress);
		LOG.info("timeout ==> " + timeout);
		
		try{
			final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(
					new URI(new StringBuilder("ws://").append(serverBaseUri).append("/broker/?token=")
							.append(token).append("&topics=").append(topicsEnum.getTopics()).append("&offset_reset=")
							.append(offsetReset).toString()),
					message -> {
						LOG.info("message length ==> " + message.length);
						
						switch (topicsEnum.getServiceName()) {
						case "ProvCompanyInfo":
							provCompanyInfoAdapterService.adapterHandler(batch,compress,message);
							break;
						case "ProvVehicleInfo":

							break;
						case "ProvDriverInfo":

							break;
						case "ProvOrderInfo":

							break;
						case "ProvOperateInfo":

							break;
						case "ProvPositionDriver":

							break;
						case "ProvPositionVehicle":

							break;
						case "ProvRatedPassenger":

							break;

						default:
							break;
						}
						
					});
			LOG.info("==========================================="+Thread.currentThread().isInterrupted());
			while (!Thread.currentThread().isInterrupted()) {
				try {
					TimeUnit.SECONDS.sleep(timeout);
					clientEndPoint.sendPing("test");
				}
				// 一般设计合理的阻塞方法都会响应中断，并抛出InterruptedException异常，需要捕获该异常并中断当前线程
				catch (InterruptedException e) {
					LOG.info("interrupted from TimeUnit#sleep() ==> " + Thread.currentThread().getName());
					Thread.currentThread().interrupt();
				}
			}
		} catch (Exception e) {
			LOG.error("", e);
		}
    	
    }  
     
}
