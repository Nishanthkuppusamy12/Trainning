package com.exception.pgm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread12 extends Thread{
	
	private int number;
	
	public Thread12(int number) {
		
		this.number = number;
	}
	
	public void run() {
		
		System.out.println(number+ " start for Execution " );
		for(int i=number*10;i<=number*10+10;i++) {
			System.out.print(i + " ");
		}
		System.out.println( number + " is end Execution");
	}
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 start for Execution " );	
		for(int i=30;i<40;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("Thread2 is end Execution ");
	}
	
}
public class ThreadExecutorService {
	
	public static void main(String[] args) {

	//ExecutorService executorService = Executors.newSingleThreadExecutor();
	ExecutorService executorService = Executors.newFixedThreadPool(3);
	executorService.execute(new Thread12(1));
	executorService.execute(new Thread12(2));
	executorService.execute(new Thread12(3));
	executorService.execute(new Thread12(4));
	executorService.execute(new Thread12(5));
	
	
//	System.out.println("Thread3 is start for execution ");
//	
//	for(int i=50;i<60;i++) {
//		System.out.print(i+ " ");
//	}
//	System.out.println("Thread3 is end execution");
	executorService.shutdown();
	
	}
}
