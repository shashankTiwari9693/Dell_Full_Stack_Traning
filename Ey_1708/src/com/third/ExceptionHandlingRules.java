package com.third;

import java.sql.SQLException;

class Parent{
	void show() throws SQLException{
		System.out.println("Parent Class Method");
	}
}
public class ExceptionHandlingRules extends Parent {
	
	@Override
	void show(){  //void show()throws Exception{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Parent p = new Parent();
ExceptionHandlingRules Obj = new ExceptionHandlingRules();
	p.show();
	Obj.show();
}

}
