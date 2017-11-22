package readinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import readinglist.platform.service.HelloWorldService;

@RestController
public class TestController {
	@Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test")
    public String test() {
        return helloWorldService.sayHello("Spring boot with Hessian.");
    }
}
