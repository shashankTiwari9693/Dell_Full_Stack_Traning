package com.fifth;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> Lset= new LinkedHashSet<>();
		Lset.add("Z");
		Lset.add("Z");
		Lset.add("Z");
		Lset.add("Z");

		Lset.add(null);
		Lset.add(null);
		Lset.add(null);
		
		Lset.add("X");
		Lset.add("A");
		Lset.add("Y");
		Lset.add("B");
		
		Iterator<String> itr = Lset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+" ");

		}
	}

}
