package com.globalpayex.college.entities;

public class collegeuser {
	public String name;
	
	//1. can be accessed from a class outside the package provided its the derived class
	//2. can be accessed from a class within the same package(need not to be derived class)
	protected char gender;
	//composition relationship among classes
	//HAS-A
	//student HAS-A address
	//professor HAS-A address
	private address address;
	
	

	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	public final char getgender() {
		return gender;
	}
	
	/*
	 * collegeuser(){
	 //this -->Student object, Professor object
	  * }
	  * 
	 */
	public String getDetails1() {
		return String.format("Name:%s\nGender:%s\nAddress:%s", this.name,this.gender,this.address!=null?this.address.getDetails():"NA");
	}
	public boolean isAddressPresent() {
		return this.address!=null;
		
	}
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
	
	public  char getGender() {
		return getGender();
	}

}
