package com.class7;

class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("I am in m synchronized nethod");
	}

	public synchronized void n() {
		// TODO Auto-generated method stub
		System.out.println("I am in n synchronized method");
	}

}

public class ReentrantThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Reentrant r= new Reentrant();
		new Thread() {
			public void run() {
				r.m();
			}
		}.start();
	}

}
