package com.xworkz.malls;

import com.xworkz.malls.constants.Types;
import com.xworkz.malls.dao.MallDAO;
import com.xworkz.malls.dao.MallDAOimpl;
import com.xworkz.malls.dto.MallDTO;
import com.xworkz.malls.service.MallService;
import com.xworkz.malls.service.MallServiceimpl;

public class MallServiceTester {

	public static void main(String[] args) {
		MallDTO dto=new MallDTO("MantrySquare", "rajajinagar", 50, 3, Types.MCDONALS);
		
		MallDAO dao=new MallDAOimpl();
		
		MallService service=new MallServiceimpl(dao);
		service.validateAndSave(dto);
	}

}
