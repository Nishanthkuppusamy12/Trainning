package com.collection.lambdaExpression;



public class CloneObject implements Cloneable{
	
	int rollNo;
	String name;
	
	public CloneObject(int rollNo,String name)  {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		try {
		
		CloneObject co= new CloneObject(1,"Nishanth");
		CloneObject co1 = (CloneObject)co.Clone();
		
		System.out.println(co.rollNo + " " + co.name);
		System.out.println(co1.rollNo + " " + co1.name);
		}catch(CloneNotSupportedException e) {
			
		}
		
	}

}
