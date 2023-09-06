
package ey_10;

public class MergeSort {

	public static void main(String[] args) {

		int[] intArr = { 3, 60, 35, 0, 2, 24, 15, 34 };

		System.out.println("Before Merge Sort");

		for (int i = 0; i < intArr.length; i++) {

			System.out.print(intArr[i] + " ");

		}

		mergeSort(intArr, 0, intArr.length - 1);

		System.out.println("\nAfter Merge Sort");

		for (int i : intArr) {

			System.out.print(i + " ");

		}

	}

	private static void mergeSort(int[] intArr, int startElement, int endElement) {

		if (startElement < endElement) {

			int midPosition = (startElement + endElement) / 2;

			mergeSort(intArr, startElement, midPosition);

			mergeSort(intArr, midPosition + 1, endElement);

			merge(intArr, startElement, midPosition, endElement);

		}

	}

	private static void merge(int[] intArr, int startElement, int midPosition, int endElement) {

		int n1 = midPosition - startElement + 1;

		int n2 = endElement - midPosition;

		int[] leftArray = new int[n1];

		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {

			leftArray[i] = intArr[startElement + i];

		}

		for (int j = 0; j < n2; j++) {

			rightArray[j] = intArr[midPosition + 1 + j];

		}

		int i = 0, j = 0, k = startElement;

		while (i < n1 && j < n2) {

			if (leftArray[i] <= rightArray[j]) {

				intArr[k] = leftArray[i];

				i++;

			} else {

				intArr[k] = rightArray[j];

				j++;

			}

			k++;

		}

		while (i < n1) {

			intArr[k] = leftArray[i];

			i++;

			k++;

		}

		while (j < n2) {

			intArr[k] = rightArray[j];

			j++;

			k++;

		}

	}

}