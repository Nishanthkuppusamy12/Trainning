package com.collection.lambdaExpression;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {

     LinkedList<String> al = new  LinkedList<String>();
// 1.Insertion order preserved and Duplicates are allowed     
      
      al.add("BMW");
      al.add("Audi");
      al.add("Benze");
      al.add("Benili");
      al.add("BMW");
      System.out.println(al);
      al.remove(2);
      System.out.println(al);
      al.add(2,"Benze");
      System.out.println(al);
// The o/p =[BMW, Audi, Benze, Benili, BMW]    
	}

}
