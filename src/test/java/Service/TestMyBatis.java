package Service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bili.service.IUserService;

/**
 * 测试spring整合mybatis
 * 
 * @author bili.ou
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/springmvc/mvc-dispatcher-servlet.xml","classpath:/springmvc/spring-mybatis.xml"})
public class TestMyBatis {

	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;

	@Autowired
	private IUserService userService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("/springmvc/spring-mybatis.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

//	@Test
//	public void testGetUserInfoById(){
//		User user = userService.getUserInfoById(1);
//		System.out.println(JSON.toJSONString(user));
//	}
	
	@Test
	public void test() {
		
	}
}
