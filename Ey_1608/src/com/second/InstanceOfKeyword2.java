package com.second;
interface ABC{}

class Parent implements ABC{}
class Child1 extends Parent{}
class Child2 extends Parent{}

public class InstanceOfKeyword2{
	public static void main(String[] args) {
		Parent P= new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		System.out.println(P instanceof Parent);
		System.out.println(P instanceof Child1);
		System.out.println(P instanceof Child2);
		
		System.out.println(c1 instanceof Parent);
		System.out.println(c1 instanceof Child1);
		
		System.out.println(c2 instanceof Parent);
		System.out.println(c2 instanceof Child2);
		
//		System.out.println(c1 instanceof Child2);
//		System.out.println(c2 instanceof Child1);
	
		System.out.println(c1 instanceof ABC);
		System.out.println(P instanceof ABC);
		System.out.println(c2 instanceof ABC);
	
	
	}
	
}


