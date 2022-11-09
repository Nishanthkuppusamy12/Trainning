// 5.Reverse the given String.
package com.String.Programs;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = sc.next();
		String temp="";

		for(int i=st.length()-1;i>=0;i--) {
			temp=temp+st.charAt(i);
		}
		System.out.println(temp);
	}

}
