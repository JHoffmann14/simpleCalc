package simpleCalc;

import simpleCalc.time;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Date date = new Date();
	/*	time cal = new time(); 
		Scanner ln = new Scanner(System.in);
		System.out.println("Please enter the hour of the first time.");
		
		String hrs = ln.nextLine();
		int hours = Integer.parseInt(hrs);
		cal.setHour(hours);
		
		
		System.out.println("Please enter the minutes of the first tiem.");
		String min = ln.nextLine();
		int minutes = Integer.parseInt(min);
		cal.setMinute(minutes);
		
		System.out.println(cal.getHour() +":"+ cal.getMinute() );*/
		Date time1 = new Date();
		Date time2 = new Date();
		time cal = new time();
		Scanner ln = new Scanner(System.in);
		
		String start = "00:00";
		int minutes;
		int hours;
		
		String RegEx = "[0-2][0-9]:[0-9][0-9]";
		// First time
		System.out.println("Please enter a time (24 hr format).");
		String tm = ln.nextLine();
		if (tm.matches(RegEx)) {
		cal.setHour(Integer.parseInt(tm.substring(0, 2)));
		cal.setMinute(Integer.parseInt(tm.substring(3, 5)));
		System.out.println("hours: " + cal.getHour());
		System.out.println("minutes: " + cal.getMinute());
		if(cal.getMinute() >= 60){
			cal.setHour(cal.hour + (cal.getMinute()/60));
			cal.setMinute(cal.getMinute()-60);
		}
		if(cal.getHour() >= 24){
			cal.setHour(Math.abs(24 - cal.getHour()));
			}
		}else {
			System.out.println("Please enter a time (24 hr format).");
			 tm = ln.nextLine();
			cal.setHour(Integer.parseInt(tm.substring(0, 2)));
			cal.setMinute(Integer.parseInt(tm.substring(3, 5)));
			System.out.println("hours: " + cal.getHour());
			System.out.println("minutes: " + cal.getMinute());
			if(cal.getMinute() >= 60){
				cal.setHour(cal.hour + (cal.getMinute()/60));
				cal.setMinute(cal.getMinute()-60);
			}
			if(cal.getHour() >= 24){
				cal.setHour(Math.abs(24 - cal.getHour()));
				}
		}
		time1.setHours(cal.getHour());
		time1.setMinutes(cal.getMinute());
		System.out.println(cal.getHour()+":"+cal.getMinute());
	//	System.out.println(time1.getHours());
		
	

	//Second time
		System.out.println("Please enter a time (24 hr format).");
		tm = ln.nextLine();
		if (tm.matches(RegEx)) {
		cal.setHour(Integer.parseInt(tm.substring(0, 2)));
		cal.setMinute(Integer.parseInt(tm.substring(3, 5)));
		System.out.println("hours: " + cal.getHour());
		System.out.println("minutes: " + cal.getMinute());
		if(cal.getMinute() >= 60){
			cal.setHour(cal.hour + (cal.getMinute()/60));
			cal.setMinute(cal.getMinute()-60);
		}
		if(cal.getHour() >= 24){
			cal.setHour(Math.abs(24 - cal.getHour()));
			}
		}else {
			System.out.println("Please enter a time (24 hr format).");
			 tm = ln.nextLine();
			cal.setHour(Integer.parseInt(tm.substring(0, 2)));
			cal.setMinute(Integer.parseInt(tm.substring(3, 5)));
			System.out.println("hours: " + cal.getHour());
			System.out.println("minutes: " + cal.getMinute());
			if(cal.getMinute() >= 60){
				cal.setHour(cal.hour + (cal.getMinute()/60));
				cal.setMinute(cal.getMinute()-60);
			}
			if(cal.getHour() >= 24){
				cal.setHour(Math.abs(24 - cal.getHour()));
				}
		}
		time2.setHours(cal.getHour());
		time2.setMinutes(cal.getMinute());
		System.out.println(cal.getHour()+":"+cal.getMinute());
		//System.out.println(time2.getHours());

		int hrsDifference;
		hrsDifference = ((time1.getHours()- time2.getHours()));
		int minDifference;
		minDifference = (time1.getMinutes()-time2.getMinutes());
		Date timeDiff = new Date();
		timeDiff.setHours(hrsDifference);
		timeDiff.setMinutes(minDifference);
		System.out.println("Difference: " + timeDiff.getHours() + ":" + timeDiff.getMinutes());
}


}
