package com.second;

@FunctionalInterface
interface SampleData {
	void fullName(String firstName, String lastName);
}

public class SomeData implements SampleData {
	@Override
	public void fullName(String firstName, String lastName) {
		System.out.println("Name is " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeData obj = new SomeData();
		obj.fullName("XYZ", "ABC");

	}

}
