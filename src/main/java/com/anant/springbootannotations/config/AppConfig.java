package com.anant.springbootannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anant.springbootannotations.controller.PizzaController;
import com.anant.springbootannotations.service.NonVegPizza;
import com.anant.springbootannotations.service.Pizza;
import com.anant.springbootannotations.service.VegPizza;

@Configuration
public class AppConfig {
	
	@Bean
	public Pizza vegPizza()
	{
		return new VegPizza();
		
	}
	
	/*
	 * @Bean public Pizza nonVegPizza() { return new NonVegPizza();
	 * 
	 * }
	 */
   
	/*
	 * @Bean public PizzaController pizzaController() { return new
	 * PizzaController(vegPizza()); }
	 */
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public PizzaController pizzaController()
	{
		return new PizzaController(vegPizza());
	}
}
