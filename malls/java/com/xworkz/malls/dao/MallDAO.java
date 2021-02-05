package com.xworkz.malls.dao;

import java.util.List;

import com.xworkz.malls.dto.MallDTO;

public interface MallDAO {
	boolean save(MallDTO dto);

	MallDTO FindByName(String Name);
	
	void addMultipleMalls(List<MallDTO> dtos);

	boolean updateLocationByName(String location, String name);
	
	boolean deleteByNameAndLocation(String name, String location);

	List<MallDTO> getAll();
	
}
