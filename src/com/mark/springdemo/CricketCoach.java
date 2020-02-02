package com.mark.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	public CricketCoach()
	{
		System.out.println("Calling no args Constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Calling set email address");
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("Calling set team name");
		this.teamName = teamName;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Calling set fortune service setter method");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Fast Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortunes() {
		
		return fortuneService.getFortune();
	}

}
