package IteratorsPgms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class RetriveTheElement {

	public static void main(String[] args) {
      
		Vector<String> names = new Vector<>();
		names.add("learn");
		names.add("from");
		names.add("Geeksforgeeks");
		// This is for ListIterator.
		ListIterator<String> li = names.listIterator();
		while(li.hasPrevious()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		// This is for Iterator
		Iterator<String> l = names.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		// This is for Enumeration
		Enumeration<String> name = names.elements();
		while (name.hasMoreElements()) {
			System.out.println(name.nextElement());
		}
		
	}

}
