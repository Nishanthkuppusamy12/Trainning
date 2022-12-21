package com.stream.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MAPconcepts {
	
	public static void main(String[] args) {
		
		List<String> li =  Arrays.asList("nish","hsg","iuoa","dtty");
		List<String> tl = Arrays.asList("jgas","jas","jgd","yuyur");
		
		List<List<String>> two = new ArrayList<List<String>>();
		two.add(li);
		two.add(tl);
		List<String> listoftwo = new ArrayList<String>();
		for(List<String> list : two) {
			for(String data : list) {
				
				listoftwo.add(data);
			}
		}
		System.out.println(listoftwo);
		
		List<String> lii = two.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		
		
		System.out.println(lii);
	}
 
	
}
