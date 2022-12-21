package com.map.concepts;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharByMap {

	static void countChar(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		char[] strc = str.toCharArray();
		for(char c : strc) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
			hm.put(c, 1);
			}
		}
		for(Map.Entry entry :hm.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
	public static void main(String[] args) {
		String str = "goodevening";
		System.out.println("The occurence of char ");
		countChar(str);
		
	}
}
