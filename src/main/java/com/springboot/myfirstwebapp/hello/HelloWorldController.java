package com.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@ResponseBody
	@RequestMapping("say-hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@ResponseBody
	@RequestMapping("say-hello-html")
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>HTML titled</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Hi, HTML body is displayed");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		
		return "sayHello";
	}

}
