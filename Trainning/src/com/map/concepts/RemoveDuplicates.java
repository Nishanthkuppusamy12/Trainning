package com.map.concepts;

import java.util.HashMap;

public class RemoveDuplicates {
	
	static void removeDups(int []arr,int n) {
		
		HashMap<Integer,Boolean> hm = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(hm.get(arr[i])== null) {
				System.out.println(arr[i]+" ");
				hm.put(arr[i],true);
			}
		}
	}

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,2,3,2,3,5};
		int n = arr.length;
        removeDups(arr,n);
	}
}
