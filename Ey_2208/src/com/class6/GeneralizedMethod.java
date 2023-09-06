package com.class6;

public class GeneralizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr= {10,4,5,3,5,6,8,23};
		String [] strArr= {"Z","A","X","B","W"};
		System.out.println("Print Integer Array");
		printArray(intArr);
		System.out.println("Printing String Array");
		printArray(strArr);
	}
	
	static <B> void printArray(B[] elements) {
		for(B ele:elements) {
			System.out.println( ele +" ");
		}
		System.out.println();
	}

}
