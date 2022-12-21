package com.multithreading;

class ThreadDemo extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hai");
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		td.start();
		System.out.println("----------");
		for(int i=0;i<10;i++) {
			
			System.out.println("Bye");
		}
	}
}
