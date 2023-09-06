package com.class6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnBoundedWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnBoundedWildCard obj = new UnBoundedWildCard();
		List<String> liststr = new ArrayList<>();
		liststr.add("ABC");
		liststr.add("xyz");
		obj.printCollectionData(liststr);

	}

	private void printCollectionData(Collection<?> objToPrint) {
		// TODO Auto-generated method stub
		System.out.println("[");
		for (Object obj : objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() + " : " + obj);
		}
		System.out.println("]");
		System.out.println();
	}

}
