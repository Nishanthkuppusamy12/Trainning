package com.String.Programs;

public class ReverseEachWordString {

public static void main(String[] args) {
	
	System.out.println(reverseWord("Today is friday"));
}
	public static String reverseWord(String str) {
		String []words = str.split(" ");
		String temp = "";
		
		for(String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			temp+=sb.toString()+" ";
		}
		return temp.trim();
	}
}
 
