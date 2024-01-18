package com.anant.springbootannotations.service;

public class NonVegPizza implements Pizza {

	@Override
	public String getPizza() {
		return "This is Non-veg pizza";
	}

}
