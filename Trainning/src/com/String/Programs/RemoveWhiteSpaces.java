// 6.Remove the White Spaces From the given String.
package com.String.Programs;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence ->");
		String st = sc.nextLine();
		String temp="";
		
		for(int i=0;i<st.length();i++) {
			char c= st.charAt(i);
			if( c!=' ') {
				temp=temp+c;
			}
			else continue;
		}
		System.out.println(temp);
		
	}
}
