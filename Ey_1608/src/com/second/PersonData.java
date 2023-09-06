package com.second;

public class PersonData implements Cloneable {

	int person_id;
	String person_name;

	PersonData(int person_id, String person_name) {
		this.person_id = person_id;
		this.person_name = person_name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		PersonData obj1 = new PersonData(123, "ABC");
		PersonData obj2 = (PersonData) obj1.clone();
		// TODO Auto-generated method stub
		System.out.println("Person id is " + obj1.person_id + "Person name is" + obj1.person_name+" space "+obj1.hashCode());
		System.out.println("Person id is " + obj2.person_id + "Person name is" + obj2.person_name+" space "+obj2.hashCode());
	}

}
