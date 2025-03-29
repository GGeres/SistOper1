package view;

import controller.Threads2;

public class ThreadMain2 {
	public static void main (String args[]) throws InterruptedException {
		int Mat[][] = new int [3][4];
		int i, j;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				Threads2 Ex2 = new Threads2(Mat);
				Ex2.start();
			}
		}
	}
}
