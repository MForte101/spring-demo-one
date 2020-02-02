package com.mark.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach coach = new BasketballCoach();
		
		System.out.println(coach.getDailyWorkout());
	}

}
