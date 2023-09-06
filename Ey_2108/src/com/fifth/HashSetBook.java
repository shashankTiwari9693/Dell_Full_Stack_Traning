package com.fifth;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> hSet= new HashSet<>();
		
		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);
		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
		Book b3 = new Book(31, "RAJA", "oracle2", "book3", 800);

		hSet.add(b1);
		hSet.add(b2);
		hSet.add(b3);
		
		
		Iterator<Book> itr = hSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

		}
	}

}
