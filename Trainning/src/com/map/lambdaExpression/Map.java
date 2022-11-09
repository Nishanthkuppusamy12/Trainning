package com.map.lambdaExpression;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
	
	     TreeMap<Integer,String> m = new TreeMap<Integer,String>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
// This is getting the values by decending order using of lambda expression internally compare is Run.	     
	    m.put(300, "Car");
		m.put(400, "Apple");
		m.put(700, "Eating");
		m.put(100, "Food");
		m.put(600,"Sleeping");
		m.put(900, "Apple");
		System.out.println(m);
	}

}
