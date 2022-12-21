package com.String.interview.program;

final class ImmutableClass {
	
	private int i;
	
	ImmutableClass(int i){
		this.i=i;
	}
	public ImmutableClass modify(int i) {
		
		if(this.i==i) {
			return this;
		}
		else {
			return new ImmutableClass(i);
		}	
	}
	public static void main(String[] args) {
		
		ImmutableClass im = new ImmutableClass(10);
		ImmutableClass t1= im.modify(10);
		ImmutableClass t2 = im.modify(100);
		
		System.out.println(im==t1);
		System.out.println(t1==t2);
		
	}

}
