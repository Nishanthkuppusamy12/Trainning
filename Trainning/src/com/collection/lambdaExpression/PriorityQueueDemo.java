package com.collection.lambdaExpression;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue<Object> pq = new PriorityQueue<>(15,new Mycomparator());
		pq.offer("A");
		pq.offer("L");
		pq.offer("D");
		pq.offer("Y");
		System.out.println(pq);
	}
}
  class Mycomparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		//System.out.println(s1);
		String s2 =obj2.toString();
		//System.out.println(s2);
		return s2.compareTo(s1);
	}
	  
  }

