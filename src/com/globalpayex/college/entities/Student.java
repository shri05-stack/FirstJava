package com.globalpayex.college.entities;

public class Student extends collegeuser {
	
	int Roll;
	float marks;
	public Student(String name, char gender, int roll, float marks) {
		super(name,gender);// calls the super class constructor
		//Internally
		//collegeuser(this)
		
		
		this.Roll = roll;
		this.marks = marks;
	}
	@Override
	public String getDetails() {
		String str1=super.getDetails();
		super.getDetails();
		// TODO Auto-generated method stub
		return String.format("%s\nroll:%s\nmarks:%s", str1, this.Roll, this.marks);
	}
	

}
