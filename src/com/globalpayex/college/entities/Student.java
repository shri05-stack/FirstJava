package com.globalpayex.college.entities;

public class Student extends collegeuser {
	
	int Roll;
	public float marks;
	public int roll;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Roll != other.Roll)
			return false;
		return true;
	}
	
	
	

}
