package com.mycompany.spring_demo_04_09.bean;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;

	
	public CricketCoach()
	{
		super();
	}
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 5k running today";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortuneService();
	}
	

}