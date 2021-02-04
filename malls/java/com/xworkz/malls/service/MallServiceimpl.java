package com.xworkz.malls.service;

import com.xworkz.malls.dao.MallDAO;
import com.xworkz.malls.dao.MallDAOimpl;
import com.xworkz.malls.dto.MallDTO;

public class MallServiceimpl implements MallService {
	
	public MallServiceimpl(MallDAO dao) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateAndSave(MallDTO mallDTO) {
		System.out.println("invoked validateAndSave");
		boolean valid = false;
		if (mallDTO != null) {
			String location = mallDTO.getLocation();
			if (location != null && location.length()>=3 && location.length()<=15 && !location.isEmpty()
					&& !location.contains(" ")) {
				System.out.println("location is valid");
				valid = true;
			} else {
				System.out.println("location is not valid");
				valid = false;
			}	
	
		}	
		if(valid) {
			String name=mallDTO.getName();
			if(name!=null && !name.isEmpty() && !name.contains(" ") && name.length()>=3) {
				System.out.println("name is valid");
				valid=true;
			}else {
				System.out.println("name is not valid");
				valid=false;
			}
		}
		
		if(valid) {
			double noOfEmployees=mallDTO.getNoOfEmployees();
			if(noOfEmployees>20 && noOfEmployees<=200) {
				System.out.println("noOfEmployees is valid");
				valid=true;
			}else {
				System.out.println("noOfEmployees is not valid");
				valid=false;
			}
		}
		
		if(valid) {
			double noOfFloors= mallDTO.getNoOfFloors();
			if(noOfFloors>=3 && noOfFloors<=10) {
				System.out.println("noOfFloors is valid");
				valid=true;
			}else {
				System.out.println("noOfFloors is not valid");
				valid=false;
			}
		}
		
		if (valid) {
			System.out.println("data is valid, can invoke dao");
			MallDAO DAO = new MallDAOimpl();
					
		} else {
			System.out.println("data is invalid, dao is null");
		}
		return false;
	}
}
