package com.fifth;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookClass {

	public static void main(String[] args) {

		ArrayList<Book> arrList =new ArrayList<>();
		
		Book b1=new Book(1,"Shashank","ora1cle","Book1",10);
		Book b2=new Book(12,"Ishwor","oracle","Book2",100);
		Book b3=new Book(31,"RAJA","oracle2","book3",800);
		
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b1);
		arrList.add(b3);
		arrList.add(b2);
		arrList.add(b2);

		for(Book b:arrList) {
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		
		Iterator<Book> itr=arrList.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
	}

}
