// 9. Checks the given String is digits or not.
package com.String.Programs;

import java.util.Scanner;

public class ContainsDigitesOrNot {
	
	public static boolean checkDigites(String st) {
		if(st== null || st.isEmpty()) {
			return false;
		}
		for(int i=0;i<st.length();i++) {
			if(!Character.isDigit(st.charAt(i))) {
				return false;
			}
		}
		return  true;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.next();
		
		System.out.println(checkDigites(st));
		
	}
}
