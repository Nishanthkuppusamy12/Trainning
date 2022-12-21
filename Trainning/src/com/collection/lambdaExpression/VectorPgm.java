package com.collection.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorPgm {
	
	public static void main(String[] args) {
		
		//ArrayList<Object> l = new ArrayList<>();
		//ArrayList<Object> l2 = new ArrayList<>(20);
	  Stack<Object> s = new Stack<>();
	  s.push("Nishanth");
	  s.push("Gk");
	  s.push("kavin");
	  System.out.println(s);
	  System.out.println(s.pop());
	  System.out.println(s);
	  System.out.println(s.peek());
	  System.out.println(s.empty());
	  System.out.println(s.search("Gk"));
	 
		
		
	}

}
