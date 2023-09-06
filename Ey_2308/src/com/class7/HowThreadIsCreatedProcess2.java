package com.class7;

public class HowThreadIsCreatedProcess2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowThreadIsCreatedProcess2 obj = new HowThreadIsCreatedProcess2();
		Thread t1 = new Thread(obj);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am also got called automatically");
	}

}
