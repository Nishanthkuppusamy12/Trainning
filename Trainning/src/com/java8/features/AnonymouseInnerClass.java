package com.java8.features;
//
//class MyRunnable implements Runnable{
//	                                         Normal Class 
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("Child class");
//		}
//	}
//	
//}
public class AnonymouseInnerClass {
	
	public static void main(String[] args) {
//		
//		Runnable r = new Runnable() {  // We get the implementation of Runnable Interface
//                                       //We won't Create object of Runnable Interface 			                          
//			public void run() {        // Anonymous InnerClass
//				for(int i=0;i<10;i++) {
//					System.out.println("Child class");
//				}
//			}
//		};
//		Thread t = new Thread(new Runnable() {
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println("Child Class");
//				}
//			}
//		});
		Thread t = new Thread(()->{
// Why we use () only means The Compiler already Knows the class Implemented Runnalbe
//interface so it has only one method run().So it understand it is Runnable Interface Implemented Class method 		
			for(int i=0;i<10;i++) {
				System.out.println("Chil Class-1");
			}
		});
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main class");
		}
		
	}

}
