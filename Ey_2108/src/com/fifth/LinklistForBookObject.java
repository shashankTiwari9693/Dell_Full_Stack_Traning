package com.fifth;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistForBookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> list = new LinkedList<>();

		Book b1 = new Book(1, "Shashank", "ora1cle", "Book1", 10);
		Book b2 = new Book(12, "Ishwor", "oracle", "Book2", 100);
		Book b3 = new Book(31, "RAJA", "oracle2", "book3", 800);

		list.add(b1);
		list.add(b2);
		list.add(b3);

		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

		}

	}

}
