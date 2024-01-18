package com.anant.springbootannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class PropertySourcess {
	
	

	@Value("${gmail.host}")
	private String host;
	
	@Value("${gmail.email}")
	private String email;
	
	
	@Value("${app.email}")
	private String appEmail;
	

	//@Value("${app.name}")
	private String appName;
	
	private String secret;
	
	
	public String getSecret() {
		return env.getProperty("secret");
	}



	



	@Autowired
	private Environment env;
	
	
	public String getAppEmail() {
		return appEmail;
	}



	public String getAppName() {
		return env.getProperty("app.name");
	}






	public String getHost() {
		return host;
	}

	

	public String getEmail() {
		return email;
	}

	


}
