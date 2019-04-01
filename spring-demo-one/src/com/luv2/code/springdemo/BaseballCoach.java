package com.luv2.code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for dependency
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneService = thefortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
