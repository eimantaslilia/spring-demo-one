package com.luv2.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve a bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call the methods on the bean
		//System.out.println(theCoach.getDailyWorkout());
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("theCoach: " + theCoach);
		System.out.println("alphaCoach: " + alphaCoach);
		
		// call our new method for fortunes
		//close the context
		context.close();
	}

}









