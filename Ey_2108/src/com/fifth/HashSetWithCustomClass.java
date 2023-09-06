package com.fifth;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetWithCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> TSet = new TreeSet<>();

		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);
		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
		Book b3 = new Book(31, "RAJA", "oracle2", "book3", 800);

		TSet.add(b1);
		TSet.add(b2);
		TSet.add(b3);

		Iterator<Book> itr = TSet.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

		}
	}

}
