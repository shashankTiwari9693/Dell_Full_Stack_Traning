package com.second;

abstract class Sample{
	abstract void show();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Sample obj = new Sample() {
			void show() {
				System.out.println("Hello everyone!");
			}
		};
		obj.show();
	}
}
