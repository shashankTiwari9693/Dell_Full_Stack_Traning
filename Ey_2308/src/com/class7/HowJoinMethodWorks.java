package com.class7;

public class HowJoinMethodWorks extends Thread {

	public static void main(String[] args) {

		HowSleepMethodWorks t1 = new HowSleepMethodWorks();
		HowSleepMethodWorks t2 = new HowSleepMethodWorks();
		HowSleepMethodWorks t3 = new HowSleepMethodWorks();

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();

	}

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Running Thread Name is" + Thread.currentThread().getName());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
