package com.class7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String s) {
		this.message = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "start :" + message);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "end");
	}

}

public class MultiThreadingExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(100);

		for (int i = 1; i < 10; i++) {
			Runnable worker = new WorkerThread(" "+i);
			executor.execute(worker);
		}

		System.out.println("Try to shutdown executors");
		executor.shutdown();
		try {
		executor.awaitTermination(5,TimeUnit.SECONDS);
		}catch(InterruptedException e) {
			System.err.println("Task interrupted");
		}finally {
			if(!executor.isTerminated()) {
				System.out.println("Cancel non-finished task");
			}
			executor.shutdownNow();
		System.out.println("Shutdown ultimantely finished");
		}
	}
}
