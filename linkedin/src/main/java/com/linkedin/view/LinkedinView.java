package com.linkedin.view;

import java.util.Scanner;

import com.linkedin.controller.LinkedinController;

public class LinkedinView {

	public static void main(String[] args) {
		
		String s = "y";
		while(s.equals("y")) {
			
		
		System.out.println("*********** Main Menu ***********");
		System.out.println("Press 1 to create profile");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		LinkedinController lc = new LinkedinController();
		
		switch(ch) {
			case 1:
				lc.createProfile();
				break;
			default:
				System.out.println("Wrong choice");
			}
		System.out.println("Press y to continue");
		s = sc.next();
		
		}
		

	}

}
