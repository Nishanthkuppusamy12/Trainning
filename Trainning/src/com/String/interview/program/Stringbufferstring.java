package com.String.interview.program;

public class Stringbufferstring {

	public static void main(String[] args) {
		String s ="java";
		String s2="java";
		String s1 = new String("java");
		String s5= "program";
		s.concat("program");
		System.out.println("It is normal string concatination "+s);
		System.out.println("-------------------");
		StringBuffer st = new StringBuffer("java");
		st.append("program");
		System.out.println("It is StringBuffer  concatination "+st);
		
		System.out.println(s==s2);// compare the reference.
		System.out.println(s==s1);// Compare reference.
		System.out.println(s.equals(s1));// compare contents.
		System.out.println(s2.equals(s1));
		String s4=s.intern();
		System.out.println(s5==s4);
	}
}
