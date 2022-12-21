package com.exception.pgm;


class AgeLessThen18Exception extends Exception{
	
	public AgeLessThen18Exception(String str) {
		super(str);
	}
}
public class Test {
	
	static  void Validate (int age) throws AgeLessThen18Exception {
		
		if(age<18) throw new AgeLessThen18Exception("NOt eligiable   for votting");
	   else {
		System.out.println("welcom to vote");
	   }
	}
	public static void main(String[] args)  {
		
        try {
        	Validate(16);
        }catch (AgeLessThen18Exception e) {
			System.out.println("caught the exception");
			System.out.println("error occured in " + e);
		}
	
}
}
