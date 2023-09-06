// arrays are compared with equals method of java
package com.firstclass;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr1= {1,2};
		int[] intArr2= {1,2};
		
		boolean[] binArr1 = {true,false};
		boolean[] binArr2 = {true,false};
		
boolean result =Arrays.equals(binArr1, binArr2);
System.out.println("result"+result);
System.out.println(Arrays.equals(intArr1, intArr2));
	}

}
