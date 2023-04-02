package com.comit.course._04_Strings;

public class Strings {

	/* A String a data structure that holds a sequence of character 
	 * 
	 * Strings are immutable - meaning you can't change a String after creating them 
	 * For more information about String use the link below
	 *    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = { 'C', 'o', 'm', 'I', 'T' };
		
		String str0 = new String(chars);
		System.out.println(str0);
		
		/* declare variable and initialize it  */
		String str1 = "ComIT";
		System.out.println(str1);
		
		/* String size */
		System.out.println(str1.length());
		
		/* String concatenation or join String we use {} for joining */
        
		String str2 = "Hello";
		String str3 = str2 + " " + str1 + ", I love java";
		//System.out.println( str3 );
		
		String str4 = str2.concat(" ").concat(str1).concat(", I love java. ");
		//System.out.println(str4);
		
		/* 
		 * String trim 
		 */
		String str5 = "  Hello   ";
		//System.out.println("-->" + str5.trim() + "<--");
		str5 = str5.trim();
		//System.out.println("-->" + str5 + "<--");
		
		String str6 = "Hello";
		/* index       01234 */
		
		/* 
		 * Grab a String Character 
		 */
		//System.out.println( str6.charAt(3) );
		
		/*
		 *  Chceck if a String is a substring of another string
		 */
		
		//System.out.println( str6.contains("el"));
		
		/*
		 * String comparison 
		 */
		
		System.out.println(str6.equals("hello"));
	}
}