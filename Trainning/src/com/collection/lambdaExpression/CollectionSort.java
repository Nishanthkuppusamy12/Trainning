package com.collection.lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(0);
		l.add(5);
		Collections.sort(l, (i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		System.out.println(l);

	}

}
