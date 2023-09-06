package com.class7;

import java.util.concurrent.TimeUnit;

public class HowSleepMethodWorks extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowSleepMethodWorks t1 = new HowSleepMethodWorks();
		HowSleepMethodWorks t2 = new HowSleepMethodWorks();

		t1.start();
		t2.start();
//t1.run();
//t1.run();
	}

	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
