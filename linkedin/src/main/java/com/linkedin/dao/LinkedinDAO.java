package com.linkedin.dao;

import com.linkedin.entity.LinkedinUser;

public class LinkedinDAO {

	public int createProfileDAO(LinkedinUser lu) {
		
		if(lu.getName().equals("test")) {
			return 1;
		}
		
		return 0;
	}
	
	

}
