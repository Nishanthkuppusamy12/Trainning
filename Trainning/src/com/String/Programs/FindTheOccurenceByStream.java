package com.String.Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class FindTheOccurenceByStream {
	
	public static void main(String[] args) {
		
		String st = "appleelppedd";
		System.out.println(findOccurence(st,'p'));
	}
	public static long findOccurence(String st , char c) {
		
		return st.chars().filter(e->(char)e==c).count();
		
	}
}
