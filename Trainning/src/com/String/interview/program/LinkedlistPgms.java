package com.String.interview.program;

import java.util.LinkedList;

public class LinkedlistPgms {
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Nishanth");
		l.add("java");
		System.out.println(l);
		l.set(1,20);
		l.addFirst(30);
		System.out.println(l);
	    l.remove(3);
	    l.removeLast();
	    System.out.println(l);
	}

}
