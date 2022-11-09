package com.collection.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eno;
	String ename;
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
}
public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee> el = new ArrayList<Employee>();
         
		el.add(new Employee(20,"Nishanth"));
		el.add(new Employee(13,"Chandru"));
		el.add(new Employee(15,"Mathi"));
		el.add(new Employee(12,"Kavin"));
		el.add(new Employee(19,"gokul"));
		System.out.println("Before Sorting->"+el);
		System.out.println("-----------------");
		Collections.sort(el,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(el);
	}

}
