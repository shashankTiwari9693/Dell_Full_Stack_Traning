package com.third;

public class HandlingMultipleExceptionUsingSingleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	HandlingMultipleExceptionUsingSingleCatchBlock obj = new HandlingMultipleExceptionUsingSingleCatchBlock();
	
}catch(NullPointerException | ArithmeticException |IndexOutOfBoundsException e) {
System.out.println(e.getMessage());
	}

}
}
