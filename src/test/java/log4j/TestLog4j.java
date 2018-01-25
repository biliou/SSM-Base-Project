package log4j;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/springmvc/mvc-dispatcher-servlet.xml","classpath:/springmvc/spring-mybatis.xml"}) 
public class TestLog4j {

	private static Logger logger = Logger.getLogger(TestLog4j.class);

	@Test
	public void test() throws UnsupportedEncodingException {
		logger.debug("我是debug");
		logger.error("我是error");
		logger.info("我是info");
		logger.warn("我是warn");
	}

}
