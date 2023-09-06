package com.class7;

public class HowThreadCreatedProcess1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		HowThreadCreatedProcess1 t1=new HowThreadCreatedProcess1();
		t1.start();

	}
	public void run() {
		System.out.println("I am running automatically");
	}

}
