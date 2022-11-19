package com.String.interview.program;

class Employee{
	final String panCardNumber;

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public Employee(String panCardNumber) {
		super();
		this.panCardNumber = panCardNumber;
	}
}

public class ImmutableDemoPgm {
	public static void main(String[] args) {
		
	Employee e = new Employee("ABCD1234");
	String s = e.getPanCardNumber();
	System.out.println(s);
	}
}