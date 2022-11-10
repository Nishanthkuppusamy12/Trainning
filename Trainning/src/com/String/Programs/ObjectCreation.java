package com.String.Programs;

public class ObjectCreation {

	public static void main(String[] args) {
		
		String s = new String("java");
		String s1="java";
		System.out.println(s==s1);
		String s2 ="new java";
		String s3= new String("new java");
		System.out.println(s3==s1);
		String s4 = s2.intern();
		System.out.println(s4);
		System.out.println(s4==s3);

	}

}
