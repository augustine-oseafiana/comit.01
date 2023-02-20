package com.comit.course_01_operators;

public class Logical {

	public static void main(String[] args) {
	
		boolean a = true;
		boolean b = false;
		boolean c = false;
		
		boolean and = a && b; /* The "and" operate return true only if both operanda are true. */  
		boolean or = a || b; /* The "or" operate return true only if both operanda are true. */
		boolean not = !a;    /* The "not" returns the opposite */
		
		boolean exp = a && b || c;
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
	}

}
