package com.firstclass;

public class Constructor {

int number;
Constructor(){
	number=100;
}
Constructor(int number){
	this.number=number;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor();
System.out.println("The value of number is "+ obj.number);

Constructor obj2=new Constructor(1000);
System.out.println("The value of number is "+ obj2.number);
	}

}
