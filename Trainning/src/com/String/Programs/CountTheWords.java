// 3.find the words in the given sentence;
package com.String.Programs;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String st=sc.nextLine();
		String arr[]=st.split(" ");
		System.out.println(arr.length);
	}

}
