package com.class7;

class SharedResouce1 {
	synchronized void print(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread3 extends Thread {
	SharedResouce1 sR;

	MyThread3(SharedResouce1 obj) {
		this.sR = obj;
	}

	public void run() {
		sR.print(5);
	}
}

class MyThread4 extends Thread {
	SharedResouce1 sR;

	MyThread4(SharedResouce1 obj) {
		this.sR = obj;
	}

	public void run() {
		sR.print(10);
	}
}

public class CodeWithSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResouce1 obj = new SharedResouce1();

		MyThread3 t3 = new MyThread3(obj);
		MyThread4 t4 = new MyThread4(obj);

		t3.start();
		t4.start();

	}

}
