package com.cts.example.enums;

public enum CinemaTickets {
	PLATINUM,
	GOLD,
	SILVER;
	
	public int ticketCost;
	 private CinemaTickets() {
		 this.ticketCost=202;
	 }
	 public int costOfTickets() {
			//need to check day which day has called this method
			if(this  == GOLD )
			return this.ticketCost-17 ;
			else if(this == SILVER)
			return this.ticketCost-77;
			else return this.ticketCost;
		}
}
