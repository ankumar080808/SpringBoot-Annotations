package com.anant.springbootannotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.anant.springbootannotations.service.Pizza;
import com.anant.springbootannotations.service.VegPizza;

/*@Component("pizzas")*/
public class PizzaController {
	
	/*
	 * @Autowired private VegPizza vegpizza;
	 */
	
	 private Pizza pizza;
	 
	 
		/* @Autowired */
	 public PizzaController(Pizza pizza)
	 {
		 this.pizza=pizza;
	 }
	  
	//Qualifer annotation use
		/*@Autowired
		 * public PizzaController(@Qualifier("vegPizza")Pizza pizza) { this.pizza=pizza;
		 * }
		 */
	/* This is constructor injection */
	/*
	 * @Autowired public PizzaController(VegPizza vegpizza) {
	 * 
	 * this.vegpizza=vegpizza; }
	 */
	
	/* This is the setter injection */
	/*
	 * @Autowired public void setPizza(VegPizza vegpizza) { this.vegpizza=vegpizza;
	 * }
	 */
	
	 public String getPizza() { return pizza.getPizza(); }
	 
	 public void init()
	 {
		 System.out.println("Initializaation");
	 }
	 public void destroy()
	 {
		 System.out.println("Destroyed");
	 }

}
