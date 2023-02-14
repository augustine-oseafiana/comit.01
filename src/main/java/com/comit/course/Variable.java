package com.comit.course;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   /*
	    comment
	    
	    This Variables are called primitives data types
	      Integer Variables
	   */
		
	   /* Declaration and Initialization*/ 	
	   int a = 10; 	/* 4 bytes */
	   long b = 1000000; /* 8 bytes */
	   
	   short c = 32000;         /* 2 bytes */
	   byte d = 120; /* 1 byte */
	   
	   
	   /*
	    * Decimal Variables
	    */
	   
	   double e = 10.456; /* 8 bytes */
	   float f = 14.453F;  /* 4 bytes */
	   
	   
	   /*
	    * Text Variables
	    */
	   
	   char g = 'a';  /* 2 bytes */
	   
	   
	   boolean h = true;
	   
	   //System.out.println(h); /* cast */
	   
	   /* reference type 
	    *
	    * - never compare reference type variables with the == operator
	    * - always compare reference type variables with equals() method
	    * 
	    * Ways to declare and initialize Strings
	    * 
	    * 1. String s = new String("Hello"); // Standard way
	    * 2. String a = "Hello"
	    */
	   String s1 = "Hello";
	   String s2 = "Hello";
	   
	   if (s1.equals(s2) ) {
		   System.out.println("Equal " + s1 + "-" + s2 );
 	   }
	   else {
		   System.out.println("Not Equal " + s1 + "-" + s2);
	   }
	   }
    }
