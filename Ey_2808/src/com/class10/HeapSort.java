
package com.class10;

public class HeapSort {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] intArr = { 3, 9, 10, 2, 1, 34, 22, 11, 0 };

		System.out.println("Before Heap Sort : ");

		for (int i = 0; i < intArr.length; i++) {

			System.out.print(intArr[i] + " ");

		}

		heapSort(intArr);

		System.out.println();

		System.out.println("After Heap Sort :");

		for (int i = 0; i < intArr.length; i++) {

			System.out.print(intArr[i] + " ");

		}

	}

	static void heapSort(int[] intArr) {

		int lengthOfArray = intArr.length;

		for (int i = lengthOfArray / 2 - 1; i >= 0; i--) {

			heapify(intArr, lengthOfArray, i);

		}

		for (int i = lengthOfArray - 1; i >= 0; i--) {

			// move the current root element to end and swap intArr[0] with intArr[length -
			// 1]

			int temp = intArr[0];

			intArr[0] = intArr[i];

			intArr[i] = temp;

			heapify(intArr, i, 0);

		}

	}

	static void heapify(int[] intArr, int lengthOfArray, int i) {

		int largestElement = i;// initialize largest as root

		int left = 2 * i + 1; // left child

		int right = 2 * i + 2; // right child

		// if left child is greater than root

		if (left < lengthOfArray && intArr[left] > intArr[largestElement]) {

			largestElement = left;

		}

		// if right element is larger than root

		if (right < lengthOfArray && intArr[right] > intArr[largestElement]) {

			largestElement = right;

		}

		// if root is not largest\

		if (largestElement != i) {

			// swap intArr[i] with intArr[largest]

			int tempArr = intArr[i];

			intArr[i] = intArr[largestElement];

			intArr[largestElement] = tempArr;

			heapify(intArr, lengthOfArray, largestElement);

		}

	}

}
