package com.xworkz.malls;

import java.util.ArrayList;
import java.util.List;
import com.xworkz.malls.constants.Types;
import com.xworkz.malls.dao.MallDAO;
import com.xworkz.malls.dao.MallDAOimpl;
import com.xworkz.malls.dto.MallDTO;

public class MallTester {

	public static void main(String[] args) {
		List<MallDTO> mallDTOs = new ArrayList<MallDTO>();

		MallDTO dto = new MallDTO("Gopalan Mall", "Tin factory", 150, 4, Types.MCDONALS);
		System.out.println(dto);

		MallDTO dto1 = new MallDTO("orean Mall", "yeshwanthpur", 200, 5, Types.DRESSES);
		System.out.println(dto1);

		MallDTO dto2 = new MallDTO("Elements Mall", "Hebbal", 160, 4, Types.SNACKS);
		System.out.println(dto2);

		MallDTO dto3 = new MallDTO("Krishna Mall", "yelankha", 140, 3, Types.HOMEESSENTIALS);
		System.out.println(dto3);

		MallDAO mallDAO = new MallDAOimpl();
		mallDAO.save(dto);
		mallDAO.save(dto1);
		mallDAO.save(dto2);
		mallDAO.save(dto3);

		System.out.println("************");
		System.out.println(mallDAO.FindByName("Elements Mall"));

		System.out.println("*****************");
		mallDAO.updateLocationByName("Tin factory", "orean Mall");

		System.out.println("********************");
		mallDAO.deleteByNameAndLocation("Tin factory", "Gopalan Mall");

		System.out.println("*********************");
		mallDAO.addMultipleMalls(mallDTOs);

		System.out.println("******************");
		System.out.print(mallDAO.getAll());
	}

}
