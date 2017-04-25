package org.netCar.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.netCar.service.impl.WebsocketClientEndpoint;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.TopicsNameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;

public class NewWebSocketThread implements Runnable {  
	
	private static Logger LOG = LoggerFactory.getLogger(NewWebSocketThread.class);
	
	private String serverBaseUri;

	private String offsetReset;

	private long timeout;

	private boolean batch;

	private boolean compress;

	private boolean logMessage;
	
	private String topics;
	
	private String token;
	
	private TopicsNameEnum topicsEnum;
	
	
    public NewWebSocketThread(String topics, String token, TopicsNameEnum topicsEnum,
    		String serverBaseUri,String offsetReset,long timeout,boolean batch,boolean compress,
    		boolean logMessage) {  
        this.topics = topics;  
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
		LOG.info("topics ==> " + topics);
		LOG.info("offsetReset ==> " + offsetReset);
		LOG.info("batch ==> " + batch);
		LOG.info("compress ==> " + compress);
		LOG.info("timeout ==> " + timeout);
		
		try{
			final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(
					new URI(new StringBuilder("ws://").append(serverBaseUri).append("/broker/?token=")
							.append(token).append("&topics=").append(topics).append("&offset_reset=")
							.append(offsetReset).toString()),
					message -> {
						LOG.info("message length ==> " + message.length);
						try {
							if (batch) {
								if (compress) {
									LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(decompress(message))
											.getOtpicList().size() + "===");
									if (logMessage) {
										LOG.info(OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().toString());
										
									}
								} else {
									LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(message).getOtpicList().size() + "===");
								}
							} else {
								LOG.info("===" + OTIpcDef.OTIpc.parseFrom(message).toString() + "===");
							}
						} catch (InvalidProtocolBufferException e) {
							LOG.error("", e);
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
    
    public static byte[] decompress(byte[] data) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            IOUtils.copy(new GZIPInputStream(new ByteArrayInputStream(data)), out);
            byte[] unzip = out.toByteArray();

            LOG.debug("Original: " + data.length);
            LOG.debug("Decompressed: " + unzip.length);
            return unzip;
        } catch (Exception e) {
            throw new RuntimeException("gunzip data error", e);
        }
    }
     
}
