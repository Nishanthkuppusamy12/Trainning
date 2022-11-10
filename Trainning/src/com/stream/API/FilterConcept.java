package com.stream.API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(50);
		marks.add(30);
		marks.add(34);
		marks.add(60);
		marks.add(65);
		System.out.println(marks);
		List<Integer> l=marks.stream().flatMap(m->m.getInteger(m));
        
	}

}
