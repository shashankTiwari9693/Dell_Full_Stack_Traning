package com.fifth;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWork {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");

		// any number of null is allowed

		arrList.add(null);
		arrList.add(null);
		arrList.add(null);

		arrList.add("Z");
		arrList.add("X");
		arrList.add("Y");
		arrList.add("B");

//		Iterator<String> itr = arrList.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next() + " ");
//		}

		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("P");
		arrList2.add("P");
		arrList2.add("Q");
		
		//Adding second arrayList in first arrayList
		arrList.addAll(arrList2);
		//size of the arrayList
		System.out.println("Size of arrayList is"+arrList.size());
		
		//removing first A;
		arrList.remove("A");
		
		//removing second aarayList from first arrayList
		arrList.set(1, "New Second Element");
		
		//removing all elements from first arrayList and keeping
		//all elements of second array List
		
		Iterator<String> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		arrList.clear();
		
		
		
		

	}

}
