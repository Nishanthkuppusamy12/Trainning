package com.multithreading;


class Display{
	
	public  synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning : ");
		try {
		      wait(2000);
		}catch(InterruptedException e){
		}
		System.out.println(name);
		}
	}
}

class MyThread1 extends Thread{
	Display d;
	String name;
	
	MyThread1(Display d ,String name){
		
		this.d = d;
		this.name = name;
	}
	public synchronized void run() {
		d.wish(name);
		notifyAll();
	}
}
public class Synchronaization {

	public static void main(String[] args) {
	  
		Display d = new Display();
		MyThread1 t =  new MyThread1(d,"Nishanth");
		t.start();
		MyThread1 t1 = new MyThread1(d,"Aathith");
		t1.start();
		
		
		
	}

}
