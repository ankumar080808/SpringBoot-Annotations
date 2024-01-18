package com.anant.springbootannotations.Loader;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {
	
	public EagerLoader()
	{
		System.out.println("This is Eager loading");
	}

}
