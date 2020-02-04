package com.cts.services;

public class SmsService implements IMessageService {
	private IFortuneService fortuneService;
	public SmsService(IFortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override 
	public String sendMessage(String to ,String msg) {
		return " sms send to "+to+" "+msg+"\n "+this.fortuneService.dailyFortune();
}
}
