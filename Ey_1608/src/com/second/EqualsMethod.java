package com.second;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "String is a immutable classs";
		String str2= "String is a immutable classs";
		
		if(str1==str2) {
			System.out.println("==works for literals or constant");
		}else {
			System.out.println("==does not work for literals or constant");
		}
		
		//Object
		String str3=new String("String is immutable class");
		String str4=new String("String is immutable class");
		
		if(str3==str4) {
			System.out.println("==works for literals or constant");
			
		}
		else {
			System.out.println("== does not works for literals or constant");
		}
		if(str3.equals(str4)) {
			System.out.println("equals method work for object");
		}
		else {
			System.out.println("equals doest not method work for object");
		}
		System.out.println("Memory Address is"+str3.hashCode());
		System.out.println("Memory Address is"+str4.hashCode());


	}

}
