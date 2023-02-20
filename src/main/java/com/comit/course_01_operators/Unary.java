package com.comit.course_01_operators;

class Unary {

	public static void main(String[] args) {
		
		int a = 5;
		
		/* a++ adds 1 to a */
		int b = a++; /* Post Increment Operator */
		
		System.out.println("Post Increment:");
		System.out.println("a:" + a );
		System.out.println("b: " + b );
		
        a = 5;
		
		/* a++ adds 1 to a */
		b = ++a; /* Pre Increment Operator */
		
		System.out.println("Pre Increment:");
		System.out.println("a:" + a );
		System.out.println("b: " + b );
		
        a = 5;
		
		/* a-- subtracts 1 to a */
		b = a--; /* Post Decrement Operator */
		
		System.out.println("Post Decrement:");
		System.out.println("a:" + a );
		System.out.println("b: " + b );
		
        a = 5;
		
		/* a-- subtracts 1 to a */
		b = --a; /* Pre Decrement Operator */
		
		System.out.println("Pre Decrement:");
		System.out.println("a:" + a );
		System.out.println("b: " + b );

	}

}
