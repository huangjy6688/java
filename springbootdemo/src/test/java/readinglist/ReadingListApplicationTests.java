package readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @RunWith(SpringJUnit4ClassRunner.class)  Junit测试
 *                                               通过Spring Boot加载上下文
 * @WebAppConfiguration
 *
 *@WebAppConfiguration(value = "src/main/webapp") 
 *
 *1、@WebAppConfiguration：测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的；value指定web应用的根；
2、@ContextHierarchy：指定容器层次，即spring-config.xml是父容器，而spring-mvc.xml是子容器，请参考《第三章 DispatcherServlet详解 ——跟开涛学SpringMVC》
3、通过@Autowired WebApplicationContext wac：注入web环境的ApplicationContext容器；
4、然后通过MockMvcBuilders.webAppContextSetup(wac).build()创建一个MockMvc进行测试；

 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReadingListApplication.class)
@WebAppConfiguration
public class ReadingListApplicationTests {
	
	@Test
	public void contextLoads() {
		//测试加载的上下文
	}
}
