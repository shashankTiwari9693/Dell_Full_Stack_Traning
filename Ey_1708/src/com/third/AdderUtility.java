package com.third;

public class AdderUtility {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdderUtility obj=new AdderUtility();
		System.out.println("Result is"+ obj.add(10, 20));
		System.out.println("Result is"+ obj.add(10, 20,30));
		System.out.println("Result is"+ obj.add(35.23, 22.44));
	}

}
