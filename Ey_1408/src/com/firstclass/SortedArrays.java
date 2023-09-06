package com.firstclass;

import java.util.Arrays;

public class SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[] = { 1, 3, 43, 45, 3, 4, 3, 4, 3, 4, 3, 5, 3, 54 };
		Arrays.sort(intArr);
//		System.out.println("SortedArray"+Arrays.toString(intArr));
		String[] strArr = { "z", "a", "b", "c" };
		Arrays.sort(strArr);
//		System.out.println("SortedArray"+Arrays.toString(strArr));
		min(intArr);
	}

	static void min(int[] intArr) {
		int min, max;
		System.out.println("minimum " + intArr[0]);
		System.out.println("maximum " + intArr[intArr.length - 1]);
	}
}
