package com.anant.springbootannotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String getController()
	{
		return "Hello from Controller";
	}
}
