package com.lt.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 数据库配置
 * @author luot
 * @date   2023年9月20日
 *
 *
 */
@ConfigurationProperties(prefix ="spring.datasource")
public class DatabaseProperties {
	
    private String classname;
	
    private String url;
    
    private String username;
    
    private String password;

	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
    
    

}
