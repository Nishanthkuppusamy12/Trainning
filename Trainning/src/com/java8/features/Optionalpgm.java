package com.java8.features;

import java.util.Optional;

public class Optionalpgm {

	public static void main(String[] args) {
		
		String s = "yugad";
		
		Optional<String> op = Optional.of(s);
		if(op.isPresent()) {
			 String st = s.toUpperCase();
			 System.out.println(st);
		}
		else System.out.println("The  st is null");
	}
}
