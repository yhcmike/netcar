package org.netCar.service.impl.cttic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.netCar.service.cttic.ProvCompanyInfoAdapterService;
import org.netCar.util.NewWebSocketThread;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class ProvCompanyInfoAdapterServiceImpl implements ProvCompanyInfoAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(ProvCompanyInfoAdapterServiceImpl.class);
	
	@Override
	public void adapterHandler(boolean batch,boolean compress,byte[] message) {
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().size() + "===");
					/*if (logMessage) {
						LOG.info(OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().toString());
						
					}*/
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case baseInfoCompany:
							for(OTIpcDef.BaseInfoCompany company : obj.getBaseInfoCompanyList()){
                                System.out.println(company.getCompanyName());
                            }
							break;
						case baseInfoVehicle:
							for(OTIpcDef.BaseInfoVehicle baseInfoVehicle : obj.getBaseInfoVehicleList()){
                                System.out.println(baseInfoVehicle.getAddress());
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
