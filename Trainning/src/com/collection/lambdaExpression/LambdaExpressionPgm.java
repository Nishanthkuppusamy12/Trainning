package com.collection.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ListOfEmployee{
	int age;
	String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public ListOfEmployee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
}
}	


public class LambdaExpressionPgm {
	
 public static void main(String[] args) {
		
		
    ArrayList<ListOfEmployee> le = new ArrayList<ListOfEmployee>();
	 le.add(new ListOfEmployee(22,"nishanth"));
	 le.add(new ListOfEmployee(23, "abi"));
	 le.add(new ListOfEmployee(24, "sri"));
	 le.add(new ListOfEmployee(25, "prasath"));
	 List<String> names =le.stream().filter(e->(e.getAge()%2==0)).map(e-> new String(e.getName())).collect(Collectors.toList());
	 System.out.println(names);
		}
	}


