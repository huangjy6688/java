package readinglist.platform.service.impl;

import org.springframework.stereotype.Service;

import readinglist.platform.service.HelloWorldService;

@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String sayHello(String name) {
		 return "Hello World! " + name;
	}

}
