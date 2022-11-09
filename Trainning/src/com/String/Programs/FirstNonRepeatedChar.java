// 7.First Non repetating charcter  in the String .
package com.String.Programs;

import java.util.Scanner;

public class FirstNonRepeatedChar {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st =sc.next();
		
		while(st.length()>0) {
			char c = st.charAt(0);
			String s=st.replace(c+"","");
			int n= st.length()-s.length();
			if(n==1) {
				System.out.println(c);
				return;			
			}
			st=s;
					
		}
	}

}
