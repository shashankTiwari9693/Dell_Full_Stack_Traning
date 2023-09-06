package com.second;

public class Counter {
	
	static int count;

	Counter(){
count++;
System.out.println("Value of count "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1 = new Counter();

		Counter c2 = new Counter();

		Counter c3 = new Counter();
	}

}
