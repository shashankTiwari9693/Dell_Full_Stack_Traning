package com.class8;

interface 	TestInterface {
	public void square(int a);
	
	default void  show() {
		
		System.out.println("Only for one class , swfualy method is defined"+"so that other class dont have to implements this");
	}
}
public class defaultKeyWordFunctionality implements TestInterface {

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		defaultKeyWordFunctionality obj = new defaultKeyWordFunctionality();
		obj.square(4);
		obj.show();
	}
	
	
}
