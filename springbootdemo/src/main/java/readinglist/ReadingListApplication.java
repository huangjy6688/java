package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 *  Spring的@Configuration：标明该类使用Spring基于Java的配置。虽然本书不会写太多
配置，但我们会更倾向于使用基于Java而不是XML的配置。

 Spring的@ComponentScan：启用组件扫描，这样你写的Web控制器类和其他组件才能被
自动发现并注册为Spring应用程序上下文里的Bean。本章稍后会写一个简单的Spring MVC
控制器，使用@Controller进行注解，这样组件扫描才能找到它。

 Spring Boot 的@EnableAutoConfiguration ： 这个不起眼的小注解也可以称为
@Abracadabra①，就是这一行配置开启了Spring Boot自动配置的魔力，让你不用再写成
篇的配置了。
	
	
	@RequestBody  将HTTP请求正文转换为适合的HttpMessageConverter对象。
	@ResponseBody 将内容或对象作为 HTTP 响应正文返回，并调用适合HttpMessageConverter的Adapter转换对象，写入输出流。
 * @author 
 *
 *
 * application.properties 运行脚本端口默认为8080；录入 server.port=8000 可以进行更改
 *
 *
 */
//开启组件扫描和自动配置  开启了Spring的组件扫描和Spring Boot的自动配置功能。
@Controller
@SpringBootApplication
public class ReadingListApplication {
	
	@RequestMapping("/springBoot")
	@ResponseBody
	public String indexHome(){
		return "hello wrold!spring-boot!";
	}
	public static void main(String[] args) {
		SpringApplication.run(ReadingListApplication.class, args);  //负责启动引导应用程序
	}
}
