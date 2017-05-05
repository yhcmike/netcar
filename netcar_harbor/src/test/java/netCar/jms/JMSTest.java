package netCar.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.dto.DriverPositionJMS;
import org.netCar.dto.VehiclepositionJMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration   
({"/spring-application.xml"}) //加载配置文件  
public class JMSTest {
	@Autowired
	private JmsTemplate vehiclePositionTemplate;
	
	@Autowired
	private JmsTemplate driverPositionTemplate;
	
	@Test
	public void vehiclePostionTestsend(){


		VehiclepositionJMS jms =  new VehiclepositionJMS();
		jms.setBizStatus(1);
		jms.setCompanyId("123");
		jms.setDirection(123);
		jms.setEncrypt(123);
		jms.setLatitude(123);
		jms.setLongitude(123);
		jms.setSpeed(123);
		jms.setElevation(123);
		jms.setVehicleNo("车牌");
		jms.setMileage(123);
		jms.setVehicleRegionCode(123);
		jms.setVehStatus(123);
		jms.setOrderId("123");
		jms.setWarnStatus(1);
		//TODO解析为json
//		String jsonPosition = JsonUtil.obj2Str(jms);
		//存放到mq
		vehiclePositionTemplate.send(jms);
		
//		JMSSend jMSSend = new JMSSend();
//		jMSSend.setAddress("address----");
//		jMSSend.setName("name-------");
//		
//		
//		jmsTemplate.send(jMSSend);
	}

	
	@Test
	public void driverPositionTestsend(){


		DriverPositionJMS jms =  new DriverPositionJMS();
		jms.setBizStatus(1);
		jms.setCompanyId("123");
		jms.setDirection(123);
		jms.setEncrypt(123);
		jms.setLicenseId("KSDKDIWIEMONEOWJOW)OEWH");
		//TODO解析为json
//		String jsonPosition = JsonUtil.obj2Str(jms);
		//存放到mq
		driverPositionTemplate.send(jms);
		
//		JMSSend jMSSend = new JMSSend();
//		jMSSend.setAddress("address----");
//		jMSSend.setName("name-------");
//		
//		
//		jmsTemplate.send(jMSSend);
	}


	
}
	
		
