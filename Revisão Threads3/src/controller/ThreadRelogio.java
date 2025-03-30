package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadRelogio extends Thread{
	@Override
	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		while(true) {
			String nowHour = format.format(new Date());
			HourView.showHour(nowHour);
			try {
				Thread.sleep(1000); //Wait for 1 second
			} catch (InterruptedException e) {
				System.out.println("Thread Interrompida.");
				break;
			}
		}
	}
}