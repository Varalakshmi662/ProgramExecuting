package com.xworkz.programming;

public class FlightBooking {
	int airplaneCode;
	String company;
	String startingPoint;
	String destination;
	int totalSeats;
	int domesticbusinessclassPrice;
	int economyClassPrice;

	public void flight(int airplaneCode, String company, String startingPoint,int domesticbusinessclassPrice) {
		if (domesticbusinessclassPrice <= 1000) {
			System.out.println("startingPoint"+startingPoint);
		}
	}
	public void flight(String startingPoint, String destination, String company, int airplaneCode, int totalSeats,
			int domesticbusinessclassPrice, int economyClassPrice) {
	}

	public void display() {
		this.airplaneCode = 3456;
		this.company = "Zet";
		this.destination = "andhrapradesh";
		this.domesticbusinessclassPrice = 1000;
		this.economyClassPrice = 1500;
		this.startingPoint = "Bangalore";
		this.totalSeats = 50;
	}
}
