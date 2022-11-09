//4.Count the occurences of given Char in a String Without Using Of Any Loop
package com.String.Programs;

import java.util.Scanner;

public class CountTheGivenChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = sc.next();
		System.out.println("Enter the Finding Char");
		String c=sc.next();
		
		//int lengofSt = st.length();
		String s = st.replace(c+"","");
		int n = st.length()-s.length();
		System.out.println(" The given char "+c+" occurences at "+n+" times");
		
	}
}
