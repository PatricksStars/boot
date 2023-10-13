package com.lt.crossdomain;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author luot
 * @date   2023年9月20日
 *
 *
 */
//方法一直接在请求地址类或方法上加@CrossOrigin
@CrossOrigin()

@RestController
@RequestMapping()
public class CrossOrigin_01 {
	
	//@CrossOrigin()
	@RequestMapping("getcrossorigin")
	public void getCrossOrigin() {
		
	}
}
