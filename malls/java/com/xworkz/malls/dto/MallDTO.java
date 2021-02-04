package com.xworkz.malls.dto;

import com.xworkz.malls.constants.Types;

public class MallDTO {
	private String name;
	private String location;
	private double noOfEmployees;
	private double noOfFloors;
	private Types types;
	
	public MallDTO() {
		// TODO Auto-generated constructor stub
	}

	public MallDTO(String name, String location, double noOfEmployees, double noOfFloors, Types types) {
		super();
		this.name = name;
		this.location = location;
		this.noOfEmployees = noOfEmployees;
		this.noOfFloors = noOfFloors;
		this.types = types;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the noOfEmployees
	 */
	public double getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * @return the noOfFloors
	 */
	public double getNoOfFloors() {
		return noOfFloors;
	}

	/**
	 * @return the types
	 */
	public Types getTypes() {
		return types;
	}

	@Override
	public String toString() {
		return "MallDTO [name=" + name + ", location=" + location + ", noOfEmployees=" + noOfEmployees + ", noOfFloors="
				+ noOfFloors + ", types=" + types + "]";
	}
	
	
}
