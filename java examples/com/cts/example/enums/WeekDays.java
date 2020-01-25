package com.cts.example.enums;

public enum WeekDays {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATDAY,
	SUNDAY;
	
	public int workingHrs;
	private WeekDays() {
		this.workingHrs=8;
	}
	public int getWorkingHrs() {
		//need to check day which day has called this method
		if(this  == SATDAY || this == SUNDAY)
		return this.workingHrs -8 ;
		return this.workingHrs;
	}
}
