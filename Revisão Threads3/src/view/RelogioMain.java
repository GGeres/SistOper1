package view;

import controller.ThreadRelogio;

public class RelogioMain {
	public static void main (String args[]) {
		Thread threadHour = new Thread(new ThreadRelogio());
		threadHour.start();
	}
}
