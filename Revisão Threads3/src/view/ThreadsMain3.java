package view;

import controller.Threads3;

public class ThreadsMain3 {
	public static void main (String args[]) throws InterruptedException {
		int i;
		for(i = 0; i < 5; i++) {
			Threads3 Ex3 = new Threads3();
			Ex3.start();
			Thread.sleep(1000 * i);
		}
	}
}
