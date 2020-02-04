package com.cts.services;

public class EmailService implements IMessageService {
	private IFortuneService fortuneService;
	
	
	public EmailService(IFortuneService fortuneService) {
	this.fortuneService=fortuneService;
	}
	@Override
public String sendMessage(String to ,String msg) {
	return "email send to "+to+" "+msg+"\n "+this.fortuneService.dailyFortune();
}
}
