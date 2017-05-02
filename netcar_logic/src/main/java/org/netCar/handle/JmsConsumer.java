package org.netCar.handle;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.netCar.dto.VehiclepositionJMS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author fss
 */
@Component
public class JmsConsumer implements MessageListener {

	private static final Logger logger = LoggerFactory.getLogger(JmsConsumer.class);
	
	@Override
	public void onMessage(Message message) {
		
		logger.info("message==================="+message);
		
		if (message instanceof ObjectMessage) {
			ObjectMessage msg = (ObjectMessage) message;
			try {
				Object obj = msg.getObject();
				logger.info("obj==================="+obj);
				if(obj instanceof VehiclepositionJMS){
					VehiclepositionJMS position = (VehiclepositionJMS)obj;
					logger.info("MQ_Consumer:" + position);
				}
			} catch (Exception e) {
				logger.error("", e);
			}
		}
	}
}
