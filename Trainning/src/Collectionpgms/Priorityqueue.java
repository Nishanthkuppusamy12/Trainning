package Collectionpgms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("nishanth");
		q.add("sriram");
		q.add("abi");
		q.add("icecream");
		
		Iterator<String> i = q.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			//abi
			//icecream
			//nishanth
			//sriram
		}
		
		System.out.println(q);
		//[abi, icecream, nishanth, sriram]
		
		q.remove("sriram");
		
        System.out.println("After Remove " + q);
        //After Remove [abi, icecream, nishanth]
 
        System.out.println("Poll Method " + q.poll());
        //Poll Method abi
 
        System.out.println("Final Queue " + q);
        //Final Queue [icecream, nishanth]
	}
}
