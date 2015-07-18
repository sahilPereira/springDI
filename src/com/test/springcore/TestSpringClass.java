package com.test.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringClass {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Restaurant restaurant = (Restaurant)context.getBean("restaurantBean");
		
		restaurant.prepareHotDrink();
	}

}
