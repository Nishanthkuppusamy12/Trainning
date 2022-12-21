package com.exception.pgm;

public class Explicitly {//extends 6 RuntimeException {
	
	// 1 static ArithmeticException e = new ArithmeticException();
	// 2 static ArithmeticException e ;
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("Hai");
		
		// 1  2 throw e;
	// 3 	System.out.println(10/0); //ava.lang.ArithmeticException
		
		// 4 System.out.println("hello"); Unreachable code
		
		// throw new Explicitly(); 5 No exception of type Explicitly can be thrown;
		//an exception type must be a subclass of Throwable
		
		//throw new Explicitly(); // 6 Exception in thread "main" com.exception.pgm.Explicitly

	}

}
