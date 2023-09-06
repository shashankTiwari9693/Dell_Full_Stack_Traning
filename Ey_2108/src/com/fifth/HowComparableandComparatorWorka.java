package com.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HowComparableandComparatorWorka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] intArr= {10,2,3,2,3,2,4,243};
	Arrays.sort(intArr);
	System.out.println("Sorted Arrays is."+ Arrays.toString(intArr));
	
	String[] strArr = {"Z","A","X","B"};
	Arrays.sort(strArr);
	System.out.println("Sorted Arrays is."+ Arrays.toString(strArr));
	
	List<String>listStr=new ArrayList<>();
	listStr.add("Z");
	listStr.add("A");
	listStr.add("Z");
	listStr.add("Z");
	
	Collections.sort(listStr);
	for(String str:listStr) {
		System.out.println(str+" ");
	}
	
	
	}
	
	
	
	
	}


