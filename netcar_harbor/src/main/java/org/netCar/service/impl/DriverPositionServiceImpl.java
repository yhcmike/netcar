package org.netCar.service.impl;

import org.netCar.dto.DriverPositionJMS;
import org.netCar.service.DriverPositionService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.google.protobuf.InvalidProtocolBufferException;

public class DriverPositionServiceImpl implements DriverPositionService{
	
	private static Logger LOG = LoggerFactory.getLogger(DriverPositionServiceImpl.class);
	@Autowired
    private JmsTemplate driverPositionTemplate;
	
	@Override
	public void operationDriverPostion(boolean batch, boolean compress, byte[] message) {
		LOG.info("operationDriverPostion ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case positionDriver:
							for(OTIpcDef.PositionDriver info : obj.getPositionDriverList()){
								//TODO解析为json 存放到mq
								DriverPositionJMS jms = new DriverPositionJMS();
								jms.setBizStatus(info.getBizStatus());
								jms.setCompanyId(info.getCompanyId());
								jms.setDirection(info.getDirection());
								jms.setDriverRegionCode(info.getDriverRegionCode());
								jms.setElevation(info.getElevation());
					            jms.setEncrypt(info.getEncrypt());
					            jms.setLatitude(info.getLatitude()/Math.pow(10.0, 6.0));
					            jms.setLicenseId(info.getLicenseId());
					            jms.setLongitude(info.getLongitude()/Math.pow(10.0, 6.0));
					            jms.setOrderId(info.getOrderId());
					            jms.setPositionTime(info.getPositionTime());
					            jms.setSpeed(info.getSpeed());
					            jms.setVehicleNo(info.getVehicleNo());
					            driverPositionTemplate.send(jms);
                            }
							break;
						default:
							break;
						}
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
		
	}

}
