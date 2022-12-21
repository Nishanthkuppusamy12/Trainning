package com.String.interview.program;

public class StringDemo {
	
	public static void main(String[] args) {
		String st = "java";
		String st1 ="JaVaJaVa";
		char []ch= {'j','a','v','a'};
		System.out.println(ch);
		StringBuffer st2 = new StringBuffer("java");
		StringBuffer st3 = new StringBuffer("java");
		StringBuilder st4 = new StringBuilder("java");
		StringBuilder st5 = new StringBuilder("java");
		System.out.println(st==st1);
		System.out.println(st3==st2);
		System.out.println(st2==st3);
		System.out.println(st4==st5);
		System.out.println(st4.equals(st5));
		System.out.println(st1.substring(2,7));
		System.out.println(st1.indexOf('a'));
		System.out.println(st1.indexOf('e'));
		System.out.println(st1.toLowerCase());
		System.out.println(st1.toUpperCase());
		
	}

}
