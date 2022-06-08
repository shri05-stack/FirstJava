package com.globalpayex.college.entities;

public class professor extends collegeuser {
	String[] subjects;
	public professor(String name, char gender, String[] subjects) {
		
		
		super(name,gender);
		
		this.subjects = subjects;
	}
	

}
