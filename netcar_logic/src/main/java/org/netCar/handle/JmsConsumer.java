package org.netCar.handle;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.netCar.dto.DriverPositionJMS;
import org.netCar.dto.VehiclepositionJMS;
import org.netCar.service.DriverPositionService;
import org.netCar.service.VehiclepositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fss
 */
@Component
public class JmsConsumer implements MessageListener {

	private static final Logger logger = LoggerFactory.getLogger(JmsConsumer.class);
	
	@Autowired
	private VehiclepositionService vehiclepositionService;
	
	@Autowired
	private DriverPositionService driverPositionService;
	
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
					vehiclepositionService.operationPostion(position);
				}
				if(obj instanceof DriverPositionJMS ){
					DriverPositionJMS position = (DriverPositionJMS)obj;
					driverPositionService.operationPostion(position);
				}
			} catch (Exception e) {
				logger.error("", e);
			}
		}
	}
}
