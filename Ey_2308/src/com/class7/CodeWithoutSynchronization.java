package com.class7;

class SharedResouce {
	void print(int n) {
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

class MyThread1 extends Thread {
	SharedResouce sR;

	MyThread1(SharedResouce sR) {
		this.sR = sR;
	}

	public void run() {
		sR.print(5);
	}
}

class MyThread2 extends Thread {
	SharedResouce sR;

	MyThread2(SharedResouce sR) {
		this.sR = sR;
	}

	public void run() {
		sR.print(10);
	}
}

public class CodeWithoutSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResouce obj = new SharedResouce();

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);

		t1.start();
		t2.start();
	}

}
