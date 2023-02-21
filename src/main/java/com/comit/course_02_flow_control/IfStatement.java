package com.comit.course_02_flow_control;

public class IfStatement {

	public static void main(String[] args) {
		
       int a = 28;
       int b = 28;
       
       // To Format your code on eclipse to aline use
       // For Mac use Command + A to select
       //             Command + Shift + F
       // Windows Use Control + A to select
       //             Control + Shift + F
       
       // 1 Scenario
       if ( a > b ) {
    	   
    	     System.out.println("a is greater than b");
       } else if ( a < b) {
    	     System.out.println("a is less than b");
       }
    	  else {
    	     System.out.println("a is equal to b");
       }
    	   
       // 2 Scenario
       
       if ( a > b ) {
  	     System.out.println("a is greater than b");
       }
       if ( a < b) {
    	   System.out.println("a is less than b");	   
       }
       if ( a==b ) {
    	   System.out.println("a is equal b");
    	   
       }
       
       // 3 Scenario - Nested If
       
       int c = 25;
       
       if ( a < c) {
    	   
    	   if ( a < c) {
    		   System.out.println("a is equal to  c");
    	   }
       }
	}

}
