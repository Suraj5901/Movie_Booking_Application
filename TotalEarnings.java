package com.Anudip.MultiThreading_Sycnchronized_Program21stAug23;

public class TotalEarnings extends Thread{
	
	int total = 0;
	public void run() {
		
		synchronized (this) {
			
			for(int i =1; i<=10; i++) {
				total = total + 100; // 100 rupees per seat
				this.notify();
			}
		}
		
		
	}

}
