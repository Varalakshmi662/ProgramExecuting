package com.xworkz.malls.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.malls.dto.MallDTO;

public class MallDAOimpl implements MallDAO {
	
	List<MallDTO> mallList;
	
	public MallDAOimpl() {
		this.mallList = new ArrayList<MallDTO>();	
		}
		
	
	@Override
	public boolean save(MallDTO dto) {
		System.out.println("invoked to save method");
		// adding into the list
		boolean added = false;
		boolean contains = this.mallList.contains(dto);
		if (!contains) {
			added = this.mallList.add(dto);
		}
		if (added) {
			System.out.println("malls are added " + dto);
		} else {
			System.out.println("malls are not added " + dto);
		}
		return added;
	}
	
	@Override
	public MallDTO FindByName(String Name) {
		System.out.println("invoked findByname");
		for (MallDTO mallDTO : this.mallList) {
			String name = mallDTO.getName();
			if (name.equals(Name)) {
				System.out.println("Malls found");
				return mallDTO;
			}
		}
		System.out.println("Malls not found");
		return null;
	}
	
	@Override
	public void addMultipleMalls(List<MallDTO> dtos) {
		System.out.println("invoking add multiple malls");
		if(dtos!=null) {
			boolean added=dtos.addAll(mallList);
			System.out.println("multiple data added"+added);
			System.out.println(dtos);
		}
	}


	@Override
	public boolean updateLocationByName(String location, String name) {
		System.out.println("invoking update Location by name");
		for (MallDTO mallDTO : mallList) {
			String mallName=mallDTO.getName();
			if(mallName!=null && mallName.equals(name)) {
				System.out.println("mall name found can update location");
				mallDTO.getLocation();
				System.out.println("updated location"+mallDTO);
				return true;
			}
		}
		System.out.println("no element in the list");
		return false;
	}

	
	
	@Override
	public boolean deleteByNameAndLocation(String name, String location) {
		System.out.println("invoking delete by name and location");
		Iterator<MallDTO> iterator = this.mallList.iterator();
		while (iterator.hasNext()) {
			MallDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getLocation().equals(location)) {
				System.out.println("name and loacation found can delete");
				iterator.remove();
				System.out.println("mall name and location deleted");
				return true;
			} else {
				System.out.println("mall name and location not found");
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "MallDAOimpl [mallList=" + mallList + "]";
	}

	@Override
	public List<MallDTO> getAll() {
		System.out.println("invoking get all method");
		return this.mallList;
	}	
	
}
