package com.class10;

public class SortArrayUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("Before Bubble Sort ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		bubbleSort(intArr);
		System.out.println();

		System.out.println("After Bubble Sort");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

	private static void bubbleSort(int[] intArr) {
		// TODO Auto-generated method stub
		int lengthOfArray = intArr.length;
		int tempArr = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			for (int j = 1; j < (lengthOfArray - i); j++) {
				if (intArr[j - 1] > intArr[j]) {
					tempArr = intArr[j - 1];
					intArr[j - 1] = intArr[j];
					intArr[j] = tempArr;
				}
			}
		}

	}

}
