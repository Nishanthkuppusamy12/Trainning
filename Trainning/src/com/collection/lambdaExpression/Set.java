package com.collection.lambdaExpression;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
//1.The insertion Order not preserved and Duplicates are  not allowed 		
		  hs.add("Beta");
		  hs.add("BMW");
	      hs.add("Audi");
	      hs.add("Benze");
	      hs.add("Benili");
	      hs.add("BMW");
	      System.out.println(hs);
// The o/p => [Beta, BMW, Audi, Benze, Benili]
	}

}
