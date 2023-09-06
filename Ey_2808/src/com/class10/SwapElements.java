package com.class10;

public class SwapElements {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] intArr = { 10, 30, 50, 70, 90, 20, 40, 60, 80 };

		System.out.println("Elements before Swapping");

		for (int i : intArr) {

			System.out.print(i + " ");

		}

		System.out.println();

		// Let's say we want to swap element at 4th index with 2nd index

		int firstIndex = 2;

		int secondIndex = 4;

		// Temp Variable

		int temp = intArr[firstIndex];

		// swapping

		intArr[firstIndex] = intArr[secondIndex];

		intArr[secondIndex] = temp;

		System.out.println("Elements after swapping 4th index value with second index ");

		for (int i : intArr) {

			System.out.print(i + " ");

		}

	}

}