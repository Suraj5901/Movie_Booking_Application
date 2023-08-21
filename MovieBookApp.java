package com.Anudip.MultiThreading_Sycnchronized_Program21stAug23;

public class MovieBookApp extends Thread {
	
	static BookTheaterSeat book;
	int seats;
	
	public void run() {
		book.bookSeats(seats);
		
	}
	
	
	public static void main(String[] args) {
		
		book = new BookTheaterSeat();
		
		MovieBookApp anil = new MovieBookApp();
		anil.seats = 7;
		anil.start();
		
		
		MovieBookApp sunil = new MovieBookApp();
		sunil.seats = 6;
		sunil.start();
		
		
		TotalEarnings totalEarning = new TotalEarnings();
		totalEarning.run();
		
		synchronized (totalEarning) {
			
			try {
				
				totalEarning.wait(2000);
				
				System.out.println("Total earnings: "+ totalEarning.total+ " Rs");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
