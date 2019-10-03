package me.training.july.basic;

import java.util.Calendar;
import java.util.Date;

public class Hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		
		int days=cal.get(Calendar.DAY_OF_MONTH);
		
		int hours=cal.get(Calendar.HOUR_OF_DAY);
		
		
		if (hours>6 && hours<12) {
			System.out.println("Good Morning");
		}
			else if (hours >12 && hours < 5) {
			System.out.println("Current Time");
			}
		else if (hours > 5 &&	 hours <8) {
			System.out.println("Good Evening");
		}
		if (days>29 && days<31) {
			System.out.println("Tuesday");
			
		}
		
		
		
	}

}
