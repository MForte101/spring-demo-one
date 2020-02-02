package com.mark.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "30 minutes of batting practice";
	}

	@Override
	public String getDailyFortunes() {
		
		return fortuneService.getFortune();
	}
	
}
