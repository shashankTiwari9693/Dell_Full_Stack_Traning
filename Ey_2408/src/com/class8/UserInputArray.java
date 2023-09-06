package com.class8;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int[] intArr = new int[6];
		String[] stuName = new String[6];
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("Enter roll number ");
			intArr[i] = myObj.nextInt();
			System.out.println("Enter Name of student ");
			stuName[i]=myObj.next();
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + " "+ "Name of the student is " + stuName[i]);
		}
	}

}
