package com.cts.example.enums;

import java.util.Scanner;

public class TicketBooking {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("!!! Enter in UpperCase only !!!");
		System.out.println("                               ");
		System.out.println("Enter PLATINUM or GOLD or SILVER : ");
		String s = scanner.nextLine(); 
	try {
		CinemaTickets cinemaTickets = CinemaTickets.valueOf(s);
		if(cinemaTickets  == cinemaTickets.PLATINUM ) 
			 System.out.println("Cost of Platinum :"+CinemaTickets.PLATINUM.costOfTickets());
			else if(cinemaTickets  == cinemaTickets.GOLD )  
			System.out.println("Cost of Gold :"+CinemaTickets.GOLD.costOfTickets());
			else if (cinemaTickets  == cinemaTickets.SILVER ) 
			System.out.println("Cost of Silver :"+CinemaTickets.SILVER.costOfTickets());
		}
	
	catch(IllegalArgumentException iae) {
		//System.out.println(iae);
		System.out.println("Told you na !!! IN UPPER CASE ONLY !!!");
	}
		
}
}
