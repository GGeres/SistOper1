package controller;

public class Thread1 extends Thread {
	public Thread1 () {
		super();
	}
	
	public void run() {
		int id = (int) getId();
		System.out.println("#"+id);
	}
}
