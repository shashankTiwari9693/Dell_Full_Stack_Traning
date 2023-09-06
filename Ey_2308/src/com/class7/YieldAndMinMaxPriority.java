package com.class7;

public class YieldAndMinMaxPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread producerThread = new Producer();
		Thread consumerThread = new Consumer();

		producerThread.setPriority(Thread.MAX_PRIORITY);
		consumerThread.setPriority(Thread.MIN_PRIORITY);
		producerThread.start();
		consumerThread.start();

	}

}

class Producer extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Producer Thread" + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Consumer Thread" + i);
			Thread.yield();
		}
	}
}
