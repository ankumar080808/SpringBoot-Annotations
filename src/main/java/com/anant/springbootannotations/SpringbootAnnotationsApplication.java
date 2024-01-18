package com.anant.springbootannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anant.springbootannotations.Loader.LazyLoader;
import com.anant.springbootannotations.ValueAnnotation.ValueAnnotation;
import com.anant.springbootannotations.controller.MyController;
import com.anant.springbootannotations.controller.PizzaController;
import com.anant.springbootannotations.propertysource.PropertySourcess;
import com.anant.springbootannotations.scope.PrototypeBean;
import com.anant.springbootannotations.scope.SingeltonnBean;
import com.anant.springbootannotations.service.VegPizza;

@SpringBootApplication
public class SpringbootAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringbootAnnotationsApplication.class, args);

		/* PizzaController pizza=context.getBean(PizzaController.class); */
		/*
		 * PizzaController pizza=(PizzaController) context.getBean("pizzaController");
		 */

		/* VegPizza veg=(VegPizza) context.getBean("vegPizza"); */

		/* VegPizza veg=(VegPizza) context.getBean("vegPizza"); */
		/*
		 * System.out.println(veg.getPizza());
		 */
		PizzaController pizza = (PizzaController) context.getBean("pizzaController");

		MyController mine = context.getBean(MyController.class);
		LazyLoader laz = context.getBean(LazyLoader.class);
		/*
		 * System.out.println("laz"); System.out.println(mine.getController());
		 * System.out.println(pizza.getPizza());
		 */

		/*
		 * SingeltonnBean sing=context.getBean(SingeltonnBean.class); SingeltonnBean
		 * sing2=context.getBean(SingeltonnBean.class); PrototypeBean
		 * pro1=context.getBean(PrototypeBean.class); PrototypeBean
		 * pro2=context.getBean(PrototypeBean.class);
		 */

		ValueAnnotation val = context.getBean(ValueAnnotation.class);
		/*
		 * System.out.println(val.getDefaultName()); System.out.println(val.getEmail());
		 * System.out.println(val.getHost()); System.out.println(val.getHomeDir());
		 * System.out.println(val.getJavaHome());
		 */
		
		PropertySourcess props=context.getBean(PropertySourcess.class);
		
        System.out.println(props.getHost());
        System.out.println(props.getEmail());
        System.out.println(props.getAppEmail());
        System.out.println(props.getAppName());
        System.out.println(props.getSecret());
        
        System.out.println(props.getAppEmail());
        
        

	}

}
