package com.comit.course_02_flow_control;

public class SwitchStatement {
     
	//Switch Statement if to select one of many codes block to execute
	public static void main(String[] args) {
		/* 
		 * write a problem that translates the day's number into the day's name according to the following table
		 *  
		 * 1 -> Monday
		 * 2 -> Tuesday
		 * 3 -> Wednesday
		 * 4 -> Thursday
		 * 5 -> Friday
		 * 6 -> Saturday
		 * 7 -> Sunday
		 */
		
		int day = 8;

		/*
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");
		} else if (day==3) {
			System.out.println("Wednesday");
		} else if (day==4) {
			System.out.println("Thursday");
		} else if (day==5) {
			System.out.println("Friday");
		} else if (day==6) {
			System.out.println("Saturday");
		} else if (day==7) {
			System.out.println("Sunday");
		}*/
		
		/* this can only work with the numeric data type (int, long, short, bytes, string , char */
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Firday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
		
		}
		

		/* Simplified Switch Statement from Java 12*/
		switch(day) {
		case -1,0,1 -> {
		 	        System.out.println("Hello");
		            System.out.println("Monday");
		}
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default -> System.out.println("Invalid day");
		}

		/* Assigning values with the simplified switch statement
		 * A default case is required.
		 */
		String name = switch(day) {
		case 0,1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};
		
		System.out.println(name);
		
	}

}
