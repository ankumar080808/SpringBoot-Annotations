package com.anant.springbootannotations.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
	
	@Value("${mail.host}")
	private String host;
	
	@Value("${mail.email}")
	private String email;

	
	@Value("Deafult Name")
	private String defaultName;
	
	@Value("${java.home}")
	private String javaHome;
	
	public String getJavaHome() {
		return javaHome;
	}



	


	/*
	 * public String getHomeDir() { return homeDir; }
	 */







	/*
	 * @Value("${HOME}") private String homeDir;
	 */
	
	public String getHost() {
		return host;
	}

	

	public String getEmail() {
		return email;
	}

	

	
	public String getDefaultName() {
		return defaultName;
	}


}
