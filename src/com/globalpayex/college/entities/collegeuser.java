package com.globalpayex.college.entities;

public class collegeuser {
	public String name;
	public char gender;
	/*
	 * collegeuser(){
	 //this -->Student object, Professor object
	  * }
	  * 
	 */
	public collegeuser(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getDetails() {
		return String.format("name:%s\ngender:%s", this.name, this.gender);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s\ngender:%s", this.name, this.gender);
	}
	

}
