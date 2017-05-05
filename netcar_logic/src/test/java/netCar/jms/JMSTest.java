package netCar.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.dto.JMSSend;
import org.netCar.handle.JmsConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration   
({"/spring-application.xml"}) //加载配置文件  
public class JMSTest {
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private JmsConsumer jmsConsumer;
	
	@Test
	public void testsend(){


		JMSSend jMSSend = new JMSSend();
		jMSSend.setAddress("address----");
		jMSSend.setName("name-------");
		jmsTemplate.send(jMSSend);
	}
	
	
	@Test
	public void testRecevice(){


		
	}



	
}
	
		
