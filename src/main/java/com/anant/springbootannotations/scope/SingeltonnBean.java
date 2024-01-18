package com.anant.springbootannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingeltonnBean {
	
	public SingeltonnBean()
	{
		System.out.println("Singelton object created");
	}

}
