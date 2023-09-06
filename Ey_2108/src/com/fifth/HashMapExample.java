package com.fifth;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(123, "ABC");
		hMap.put(123, null);
		hMap.put(123, null);
		hMap.put(null, "PQR");
		hMap.put(null, "XYZ");
		hMap.put(135, "MNO");
		
//		hMap.remove(135);
//		
		for(Map.Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		

	}

}
