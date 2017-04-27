package org.netCar.service.impl.cttic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;
import org.netCar.service.cttic.ProvRatedPassengerAdapterService;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class ProvRatedPassengerAdapterServiceImpl implements ProvRatedPassengerAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(ProvRatedPassengerAdapterServiceImpl.class);
	
	@Override
	public void adapterHandler(boolean batch,boolean compress,byte[] message) {
		LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().size() + "===");
					/*if (logMessage) {
						LOG.info(OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().toString());
						
					}*/
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case ratedPassenger:
							for(OTIpcDef.RatedPassenger ratedPassenger : obj.getRatedPassengerList()){
                                System.out.println(ratedPassenger.getCompanyId());
                            }
							break;
						case ratedPassengerComplaint:
							for(OTIpcDef.RatedPassengerComplaint ratedPassengerComplaint : obj.getRatedPassengerComplaintList()){
                                System.out.println(ratedPassengerComplaint.getCompanyId());
                            }
							break;
						case ratedDriverPunish:
							for(OTIpcDef.RatedDriverPunish ratedDriverPunish : obj.getRatedDriverPunishList()){
                                System.out.println(ratedDriverPunish.getCompanyId());
                            }
							break;
						case ratedDriver:
							for(OTIpcDef.RatedDriver ratedDriver : obj.getRatedDriverList()){
                                System.out.println(ratedDriver.getCompanyId());
                            }
							break;
						case shareCompany:
							for(OTIpcDef.ShareCompany shareCompany : obj.getShareCompanyList()){
                                System.out.println(shareCompany.getCompanyId());
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
