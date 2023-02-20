package com.comit.course_01_operators;

public class Arithmetic {
	

	public static void main(String[] args) {
		
		int a = 8;
		int b = 3;
		int c = 5;
		int d = 11;
		
		int sum = a + b; /* Addition Operator */
		int sub = a - b; /* Subtraction Operator */
		double div = a / (double) b; /* Division Operator */
		int mul = a * b; /* Multiplication Operator */
		
		System.out.println("Addition:" + sum);
		System.out.println("Subtraction:" + sub);
		System.out.println("Division:" + div);
		System.out.println("Multiplication:" + mul);
		
		int mod = a % b; /* Division Remainder */
		System.out.println("Modulus: " + mod);
		
		
		int exp = (a + b) * c / d;
		
		System.out.println("Expression:" + mod);
	}

}
