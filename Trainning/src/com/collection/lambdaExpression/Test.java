package com.collection.lambdaExpression;


import java.util.TreeSet;

//class MyComparator implements Comparator{
//	public int compare(Object obj1,Object obj2) {
//		Integer i1 =(Integer)obj1;
//		Integer i2=(Integer)obj2;
////		if(i1<i2) return 1;   
////		else if(i1>i2) return-1;
////		else return 0;
//		
//		return(i1<i2)?1:(i1>i2)?-1:0;
//		
//	}
//	
//} 
public class Test {

	public static void main(String[] args) {
	
		TreeSet<Integer> ts = new TreeSet<Integer>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		
		ts.add(10);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		ts.add(0);
		System.out.println(ts);
	}

}
