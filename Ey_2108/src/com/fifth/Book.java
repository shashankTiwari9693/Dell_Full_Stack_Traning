package com.fifth;

public class Book implements Comparable<Book>{
	int bookId;
	String author, publisher, name;
	int quantity;
	
	
	public Book(int bookId, String author, String publisher, String name, int quantity) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
		this.quantity = quantity;
	}


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(bookId>o.bookId) {
		return 1;
		}
		else if (bookId<o.bookId) {
			return -1;
		}
		
		return 0;
	}

	
}
