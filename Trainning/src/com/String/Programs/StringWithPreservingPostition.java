// 10. Reverse the String of preserving space.
package com.String.Programs;

import java.util.Scanner;

public class StringWithPreservingPostition {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String st = sc.nextLine();
    reverseTheString(st);

}
public static void reverseTheString(String st) {
	
	char [] c1 = st.toCharArray();
    char [] c2 = new char[st.length()] ;
    
    for(int i=0;i<c1.length;i++) {
    	if(c1[i]==' ') {
    		c2[i]=' ';
    	}
    }
    int j=c2.length-1;
    for(int i=0;i<c1.length;i++) {
    	if(c1[i]!=' ') {
    		c2[j]=' ';
    		j--;
    	}
    	c2[j]=c1[i];
    }
    j--;
    System.out.println(st +"->" + String.valueOf(c2));
	}
}
//The java string valueOf() method converts different types of values into string.
//By the help of string valueOf() method, you can convert int to string, long to string,
//boolean to string, character to string, float to string, double to string, 
//object to string and char array to string.

