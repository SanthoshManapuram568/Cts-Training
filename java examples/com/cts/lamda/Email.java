package com.cts.lamda;

public class Email implements Greetings {
		@Override
		public void sendGreeting(String message) {
			// logic to send greetings over email
			System.out.println("Greeting sent on EMAIL : " + message);
		}

	}