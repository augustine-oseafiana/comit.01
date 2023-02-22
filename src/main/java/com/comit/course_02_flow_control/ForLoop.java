package com.comit.course_02_flow_control;

public class ForLoop {
	
	/* 
	 * The for-loop is used when you know exactly how many times you want
	 * to loop through a block of code.
	 */
	public static void main(String[] args) {
	    
		int i = 0; 
	    while(i < 10) {	
			System.out.println(i);
			++i;	
			
		}

	      /* initialization; termination; increment */
	    for(int j= 0; j < 10; j++) {
	    	System.out.println(j);
	    }
	}

}
