package view;
import controller.Thread1;
public class Thread_Main {
	public static void main (String args[]) throws InterruptedException {
		for(int i = 0; i < 5; i++) {
			Thread1 Ex1 = new Thread1();
			Ex1.start();
			Thread.sleep(1000 * i);
		}
	}
}