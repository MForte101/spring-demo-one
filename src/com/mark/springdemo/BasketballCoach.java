package com.mark.springdemo;

public class BasketballCoach implements Coach {
	
	private FortuneService fortuneService; 
	
	public BasketballCoach() {};
	
	public BasketballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 100 free throws";
	}

	@Override
	public String getDailyFortunes() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//add init method
	public void doStartupThings() {
		System.out.println("Calling start up methods");
	}
	
	//add destroy method
	public void doCloseDownThings() {
		System.out.println("Calling shutdown methods");
	}
	
}
