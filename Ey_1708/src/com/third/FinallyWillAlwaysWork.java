package com.third;

public class FinallyWillAlwaysWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sampleMethod();
		System.out.println("Result is "+ result);
	}
	static int sampleMethod() {
		try {
			return 123;
		} finally {
			System.out.println("Code just returning a integer 123 ");
		}
	}

}
