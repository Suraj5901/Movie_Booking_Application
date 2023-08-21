package com.Anudip.MultiThreading_Sycnchronized_Program21stAug23;

public class BookTheaterSeat {
	
	int total_Seats = 10;
	void bookSeats(int seats) {
		
		synchronized (this) {
			
			if(total_Seats >= seats) {
				System.out.println("Seat booked Successfully");
				total_Seats = total_Seats - seats;
				System.out.println("Seats left : "+ total_Seats);
			}else {
				System.out.println("Seat cannot be booked");
				System.out.println("Seat left: "+ total_Seats);
			}
			
		}
		
	}

}
