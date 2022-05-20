package com.linkedin.controller;

import java.util.Scanner;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.service.LinkedinService;

public class LinkedinController {

	public void createProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = sc.next();
		
		System.out.println("Enter password:");
		String password = sc.next();
		
		System.out.println("Enter email:");
		String email = sc.next();
		
		System.out.println("Enter address:");
		String address = sc.next();
		
		LinkedinUser lu = new LinkedinUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		LinkedinService ls = new LinkedinService();
		int i = ls.createProfileService(lu);
		
		if(i>0) {
			System.out.println("Profile is created for "+name);
		}
		else {
			System.out.println("failed to create profile");
		}
		
		
		
		
	}
	
	

}
