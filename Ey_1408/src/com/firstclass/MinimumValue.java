package com.firstclass;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = {1,3,43,45,3,4,3,4,3,4,3,5,3,54};
		min(intArr);
	}
	static void min(int[] intArr) {
		int min =intArr[0];
		for(int i=0;i<intArr.length;i++) {
			if(min>intArr[i]) {
				min=intArr[i];
			}
		}
		System.out.println("Minimun value is"+min);
	}

}
