package com.mark.springdemo;
import java.util.Random; 

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortuneOptions = {"good day", "bad day", "worst day"};
		
		Random rand = new Random(); 
		
		int selection = (rand.nextInt(3));
		
		return fortuneOptions[selection];
	}

}
