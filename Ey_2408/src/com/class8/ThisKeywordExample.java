package com.class8;

public class ThisKeywordExample {

	public static void main(String[] args) {
		ThisKeywordExample obj = new ThisKeywordExample();
		System.out.println(obj);
		obj.display();
		
		ThisKeywordExample obj2 = new ThisKeywordExample();
		System.out.println(obj2);
		obj2.display();
	}
	
	void display() {
		System.out.println(this);
	}
}
