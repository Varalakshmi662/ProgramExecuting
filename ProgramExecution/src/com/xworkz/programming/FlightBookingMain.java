package com.xworkz.programming;

public class FlightBookingMain {

	public static void main(String[] args) {
		FlightBooking flightBooking = new FlightBooking();
		flightBooking.flight(2455,"zet","Bangalore", 1000);
		System.out.println(flightBooking.startingPoint);
		flightBooking.display();
		System.out.println(flightBooking.company);
		System.out.println(flightBooking.destination);
		System.out.println(flightBooking.domesticbusinessclassPrice);
		System.out.println(flightBooking.economyClassPrice);
		System.out.println(flightBooking.startingPoint);
		System.out.println(flightBooking.totalSeats);
	}

}
