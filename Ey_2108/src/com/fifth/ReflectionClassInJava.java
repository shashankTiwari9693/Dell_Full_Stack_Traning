package com.fifth;

class SampleClass {
}

interface MyInterface {
}

public class ReflectionClassInJava {

	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());

	}

	public static void main(String[] args) throws ClassNotFoundException {

		// TODO Auto-generated method stub

		SampleClass obj = new SampleClass();
		ReflectionClassInJava rC = new ReflectionClassInJava();
		rC.printName(obj);

		Class c = boolean.class;
		System.out.println(c.getName());

		Class c2 = ReflectionClassInJava.class;
		System.out.println(c2.getName());

		Class c4 = Class.forName("com.programming.class5.reflectionClassInJava");
		System.out.println(c4.getName());
	}

}