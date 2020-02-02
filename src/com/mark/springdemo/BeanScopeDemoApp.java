package com.mark.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		//retrieve from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach AlphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == AlphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("Memory location for the coach " + theCoach);
		
		System.out.println("Memory location for the Alpha Coach " + AlphaCoach);
		
		context.close();
		
	}

}
