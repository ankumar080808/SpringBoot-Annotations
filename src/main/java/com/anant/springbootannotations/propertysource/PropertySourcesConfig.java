package com.anant.springbootannotations.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:app.properties")

@PropertySources({@PropertySource("classpath:mail.properties"),
	@PropertySource("classpath:app.properties")	
})
public class PropertySourcesConfig {

}
