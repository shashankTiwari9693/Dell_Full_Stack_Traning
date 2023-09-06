//package com.fifth;
//
//import java.util.HashMap;
//import java.util.Map.Entry;
//
//public class HashMapForCustomClasses {
//	public static void main(String[] args) {
//		HashMap<Integer, Book> hMap = new HashMap<>();
//		
//
//		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);
//		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
//		Book b3 = new Book(31, "Professional RAJA", "oracle2", "book3", 800);
//		
//		hMap.put(123, b3);
//		hMap.put(135, b2);
//		hMap.put(121, b3);
//		
//		
//		for(Entry<Integer, Book> m: hMap.entrySet()) {
//			int key=m.getKey();
//			Book b=m.getValue();
//			System.out.println("Key" + key +"details");
//			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
//			
//		}
//	}
//}


package com.fifth;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapForCustomClasses {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Book> hMap = new LinkedHashMap<>();
		

		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);
		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
		Book b3 = new Book(31, "Professional RAJA", "oracle2", "book3", 800);
		
		hMap.put(123, b3);
		hMap.put(135, b2);
		hMap.put(121, b3);
		
		
		for(Entry<Integer, Book> m: hMap.entrySet()) {
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println("Key " + key +"details");
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
			
		}
	}
}
