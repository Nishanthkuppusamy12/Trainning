package com.String.Programs;

import java.util.Scanner;

public class ReverseStringIterationAndRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = sc.next();
		System.out.println(reverseUsingRecursion(st));
	}

	public  static String reverseUsingRecursion(String st) {
		
		if(st==null || st.length()<=1) {
			return st;
		}
		return reverseUsingRecursion(st.substring(3))+st.charAt(0);
		
	}
}
 