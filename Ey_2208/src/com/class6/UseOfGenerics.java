package com.class6;

class MyGeneralizedClass<T>{
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}

public class UseOfGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		System.out.println(intType.get());
		intType.add(31);
		
		System.out.println(intType.get());
		
		
		MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
		strType.add("shashank");
		System.out.println(intType.get());
		strType.add("Tiwari");
		
		System.out.println(strType.get());
		
		
	}

}
