package com.class8;

class Parent {
	void show() {
		System.out.println("Parent Class Function - show");
	}

	int data = 10;
}

public class SuperKeywordExplanation extends Parent {
	void show() {
		System.out.println("Child class Function -show");
	}

	int data = 20;

	void display() {
		System.out.println("The value of current class object data is " + this.data);
		System.out.println("The value of immediate class object data is " + super.data);
		this.show();
		super.show();
	}

	public static void main(String[] args) {
		SuperKeywordExplanation obj = new SuperKeywordExplanation();
		obj.display();
		
	}
}
