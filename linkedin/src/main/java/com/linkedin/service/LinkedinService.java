package com.linkedin.service;

import com.linkedin.dao.LinkedinDAO;
import com.linkedin.entity.LinkedinUser;

public class LinkedinService {

	public int createProfileService(LinkedinUser lu) {
		
		LinkedinDAO ld = new LinkedinDAO();
		int i = ld.createProfileDAO(lu);
		

		return i;
	}
	
	

}
