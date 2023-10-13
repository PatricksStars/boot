package com.lt.crossdomain;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseHead_04 {
	
	@RequestMapping("/addhead")
	public void addHead(HttpServletResponse response) {
		// 允许所有，不安全
	    response.addHeader("Access-Control-Allow-Origin", "*");
	    response.addHeader("Access-Control-Max-Age", "10");
	    response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	    response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT");
	    response.setHeader("Access-Control-Allow-Credentials", "true");
	}
}
