package com.cts.springex;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.services.*;
public class MyAoo {
	public static void main(String[] args) {
		
		
		//without interface i.e tight coupling
		
		
		/*EmailService e = new EmailService();
		String str = e.sendMessage("someone@gmail.com", "hello...");
		System.out.println(str);
	
		SmsService s = new SmsService();
		String str = s.sendMessage("7780731077 ", "hello...");
		System.out.println(str);
		
		
		
		
		//with interface still tight coupling
		
		
		IMessageService service = new EmailService();
		String str = service.sendMessage("someone", "something");
		System.out.println(str);
		
		 */
		
		
		//fetch instance bean factory based on config file
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//fetch obj
		
		IMessageService service =applicationContext.getBean("msgService",IMessageService.class);
		String str = service.sendMessage("someone", "something");
		System.out.println(str);
		
		IMessageService service1 =applicationContext.getBean("msgService1",IMessageService.class);
		String str1 = service1.sendMessage("someone", "something");
		System.out.println(str1);
	}
}
