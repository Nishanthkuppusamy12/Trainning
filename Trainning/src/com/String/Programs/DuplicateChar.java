// 1.print Duplicate charcters from a String;
package com.String.Programs;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String st = sc.next();
		String temp="";
		
		while(st.length()>0) {
			char c=st.charAt(0);
			String s1=st.replace(c+"", "");
			int n= st.length()-s1.length();
			if(n!=1) {
				temp+=c;
			}
			st=s1;
		}
		System.out.println(temp);
	}	
}
