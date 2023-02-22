package com.comit.course_02_flow_control;

public class whileLoop {

	/* Loops can execute a block of code while a condition is true
	 * 
	 */
	public static void main(String[] args) {
		
		int i = 0;
		
		/*
		while(i < 10) {
			
			System.out.println(i);
			++i;
		
		}*/
		
		i=0;
		
		do {
			System.out.println(i);
			++i;	
		}while (i < 10);

		System.out.println("The end");
	}

}
