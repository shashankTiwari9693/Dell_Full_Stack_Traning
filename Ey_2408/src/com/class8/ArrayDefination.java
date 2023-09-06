package com.class8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDefination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = new Integer[2];
		intArr[0]=10;
		intArr[1]=20;
		
		ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(intArr));
		
		Iterator<Integer> itr=arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
