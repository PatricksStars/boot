package com.lt.crossdomain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurer_02_CorsFilter_03 implements WebMvcConfigurer{
	
	/**
	 * 方法一
	 * 
	 * 表示该应用的所有方法都会处理跨域请求，

		allowedMethods：表示允许通过的请求方法
		
		allowedOrigins：表示允许请求的地址
		
		这样配置后就不必在每个类或方法上添单独配置跨域了。
	 */
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//允许哪些接口
                .allowedMethods("*")
                .allowedOrigins("http://localhost:8080");
    }
	
	/**
	 * 方法二
	 * 
	 * 潜在的威胁，常见的是 CSRF，跨站请求伪造（英语：Cross-site request forgery），也被称为 one-click attack 
	 * 或者 session riding，通常缩写为 CSRF 或者 XSRF， 是一种挟制用户在当前已登录的Web应用程序上执行非本意的操作的攻击方法。
	 * 跟跨网站脚本（XSS）相比，XSS 利用的是用户对指定网站的信任，CSRF 利用的是网站对用户网页浏览器的信任。
	 * @return
	 */
	@Bean
    CorsFilter corsFilter(){
        //获取UrlBasedCorsConfigurationSource
        //其使用URL路径模式为请求选择CorsConfiguration。模式匹配可以通过PathMatcher或预先解析的PathPatterns来完成
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //获取CorsConfiguration对象
        CorsConfiguration cfg = new CorsConfiguration();
        //设置cors
        cfg.addAllowedMethod("*");
        cfg.addAllowedOrigin("http://localhost:8080");
        //将设置cors 注册到CorsConfiguration中
        source.registerCorsConfiguration("/**", cfg);//pattern:配置哪些接口可以请求，config：跨域配置
        return new CorsFilter(source);
    }

}
