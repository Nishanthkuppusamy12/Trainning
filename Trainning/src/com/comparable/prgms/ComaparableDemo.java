package com.comparable.prgms;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.lambdaExpression.List;

class Student implements Comparable<Student>{
	int roll,marks;
	String name;
	
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
  
	public int compareTo(Student s) {
	
		return roll>s.roll?1:-1;
	}

	
	}
public class ComaparableDemo {
	
	public static void main(String[] args) {
		
    ArrayList<Student>std = new ArrayList<>();
	
	std.add(new Student(101,65,"Nishanth"));
	std.add(new Student(103,75,"Sri"));
	std.add(new Student(102,35,"gukul"));
	std.add(new Student(105,67,"abi"));
	std.add(new Student(104,87,"chandru"));
	
	Collections.sort(std,(i,j)->i.marks>j.marks?1:-1);
	for(Student s:std) {
		System.out.println(s);
	}
	}
}
