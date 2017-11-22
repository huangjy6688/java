package readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

import readinglist.platform.service.HelloWorldService;

/**
 * Hessian RPC 服务端设置
 * @author lenovo
 *
 */
@SpringBootApplication
public class HessianServerApplication {
	
	@Autowired
    private HelloWorldService helloWorldService;
	
	 public static void main(String[] args) {
	        SpringApplication.run(HessianServerApplication.class, args);
	 }
	 
	 	//发布服务
	    @Bean(name = "/helloWorldService")
	    public HessianServiceExporter accountService() {
	        HessianServiceExporter exporter = new HessianServiceExporter();
	        exporter.setService(helloWorldService);
	        exporter.setServiceInterface(HelloWorldService.class);
	        return exporter;
	    }
}
