package com.stream.API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(0);
		marks.add(20);
		marks.add(15);
		marks.add(10);
		marks.add(5);
		System.out.println(marks);
		List<Integer> l2=marks.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(l2);
	}

}
