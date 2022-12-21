package com.exception.pgm;

class JavaException {
	 public static void main(String args[]) {
	  int d = 0;
	  int n = 20;
	  try {
	   int result = n/d;
	   System.out.println(result);
	  } 
	  catch (ArithmeticException e) {
	   System.out.println("In the catch Block due to Exception = " + e);
	  }
	  catch (Exception w) {
		  System.out.println("Exception");
	  }
	  System.out.println("End Of Main");
	 }
	}
