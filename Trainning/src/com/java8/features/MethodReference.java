package com.java8.features;

public class MethodReference {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReference::print);
		t.start();
	
	}
	public static void print() {
		System.out.println("Hai im method of print");
	}

}
