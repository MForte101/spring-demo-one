package com.mark.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleApplicationContext.xml");
		//retrieve from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		boolean areTheyTheSameObject = (theCoach == alphaCoach);
		System.out.println(areTheyTheSameObject);
		
		System.out.println(theCoach);
		System.out.println(alphaCoach);

		context.close();
		
	}

}
