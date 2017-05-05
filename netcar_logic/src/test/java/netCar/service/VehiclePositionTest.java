package netCar.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.domain.TestVehiclePosition;
import org.netCar.dto.VehiclepositionJMS;
import org.netCar.service.TestVehiclePositionService;
import org.netCar.service.VehiclepositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ffd on 2017/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
        ({"/spring-application.xml"}) //加载配置文件
public class VehiclePositionTest {
    @Autowired
    private VehiclepositionService vehiclepositionService;
    
    @Autowired
    private TestVehiclePositionService testVehiclePositionService;
    

    @Test
    public void testAdd(){
    	List<TestVehiclePosition> vehiclePositionList = testVehiclePositionService.listAllByOrderId("B37491861589339998");
    	for(TestVehiclePosition vehiclePosition : vehiclePositionList){
    		VehiclepositionJMS jms = new VehiclepositionJMS();
	    		jms.setCompanyId(vehiclePosition.getCompanyId());
	    		jms.setVehicleNo(vehiclePosition.getVehicleNo());
	    		jms.setVehicleRegionCode(vehiclePosition.getVehicleRegionCode());
	    		jms.setPositionTime(vehiclePosition.getPositionTime().longValue());
	    		jms.setLongitude(BigDecimal.valueOf(vehiclePosition.getLongitude().longValue()).divide(BigDecimal.valueOf(1000000)).doubleValue());
	    		jms.setLatitude(BigDecimal.valueOf(vehiclePosition.getLatitude().longValue()).divide(BigDecimal.valueOf(1000000)).doubleValue());
	    		jms.setSpeed(vehiclePosition.getSpeed());
	    		jms.setDirection(vehiclePosition.getDirection());
	    		jms.setElevation(vehiclePosition.getElevation());
	    		jms.setMileage(vehiclePosition.getMileage());
	    		jms.setEncrypt(vehiclePosition.getEncrypt());
	    		jms.setWarnStatus(vehiclePosition.getWarnStatus());
	    		jms.setVehStatus(vehiclePosition.getVehStatus());
	    		jms.setBizStatus(vehiclePosition.getBizStatus());
	    		jms.setOrderId(vehiclePosition.getOrderId());
	    		vehiclepositionService.operationPostion(jms);
	    		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	}
      //vehiclepositionService.operationPostion(null);
    }
}
