package com.class9;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

	}
	static void display() {
		int n=8;
		for(int j=0;j<n;j++) {
			System.out.println("Hello world !!! \n");
			
		}
		for (int i =0;i<n;i++)
		{
			System.out.println("Hello world !!! \n");
		}
		for(int i=2;i<n;i=(int)Math.pow(i, 2)) {
			System.out.println("Hello world !!! \n");
		}
	}

}
