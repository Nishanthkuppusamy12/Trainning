package Collectionpgms;

import java.util.LinkedList;
import java.util.Queue;

public class Queueconcepts {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<6;i++) {
			q.add(i);
		}
		System.out.println("elements "+q);
		
		int removable = q.remove();
		System.out.println(removable);
		
		System.out.println(q);
		int head = q.peek();
		System.out.println(head);
		int head1 = q.peek();
		System.out.println(head1);
		int element = q.element();
		System.out.println(element);
		int size = q.size();
		System.out.println(size);
	}

}
