package com.java8.features;

interface Interfacepgm{
public static void staticMethod() {
		
		System.out.println("it is static method ");
	}
	default void defaultMethod() {
		System.out.println(" it is default method ");
	}
}
interface Interfacepgm1 {
	
public static void staticMethod() {
		
		System.out.println("it is static method ");
	}
	default void defaultMethod() {
		System.out.println(" it is default method1 ");
	}
}
class GetMethods implements Interfacepgm,Interfacepgm1{
	
	@Override
	public void defaultMethod() {
		
		Interfacepgm.super.defaultMethod();
		//Interfacepgm1.super.defaultMethod();
	}
	public static void main(String[] args) {
		
		GetMethods gm = new GetMethods();
		gm.defaultMethod();
	}

	

	
}

