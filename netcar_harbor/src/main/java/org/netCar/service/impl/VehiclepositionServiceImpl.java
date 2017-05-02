package org.netCar.service.impl;

import org.netCar.service.VehiclepositionService;
import org.netCar.util.CtticDataUtils;
import org.netCar.util.JsonUtil;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Created by lyq on 2017/4/19.
 * 车辆定位信息
 */
@Service
public class VehiclepositionServiceImpl implements VehiclepositionService {

    private static Logger LOG = LoggerFactory.getLogger(VehiclepositionServiceImpl.class);
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void operationVehiclePostion(boolean batch,boolean compress,byte[] message) {
    	LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case positionVehicle:
							for(OTIpcDef.PositionVehicle positionVehicle : obj.getPositionVehicleList()){
								//TODO解析为json 存放到mq
								String jsonPosition = JsonUtil.obj2Str(positionVehicle);
					
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
