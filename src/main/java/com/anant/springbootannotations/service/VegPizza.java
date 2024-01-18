package com.anant.springbootannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@Component
@Primary*/
public class VegPizza implements Pizza {
	
	public String getPizza() {
		
		return "This is veg pizza";
	}

}
