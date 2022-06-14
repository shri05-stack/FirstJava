package com.globalpayex.college.entities;

public class collegeuser {
	protected String name;
	
	//1. can be accessed from a class outside the package provided its the derived class
	//2. can be accessed from a class within the same package(need not to be derived class)
	protected char gender;
	//composition relationship among classes
	//HAS-A
	//student HAS-A address
	//professor HAS-A address
	private address address;
	public collegeuser(String name, char gender)
	{
		this.name=name;
		this.gender=gender;
		this.address=new address();
	}
	public collegeuser(String name, char gender, address addr)
	{
		this.name=name;
		this.gender=gender;
		this.address=addr;
	}
	

	public address getAddressRef() {
		return this.address;
	}
	public String getDetails()
	{
		return String.format("Name:%s\nGender:%s", name,gender);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s\ngender:%s", this.name, this.gender);
	}
	
	

}
