package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class professor extends collegeuser implements SalariedIndividual {
	double costperday;
	int workingdays;
	String[] subjects;
	public professor(String name, char gender, String[] subjects, double costperday, int workingdays) {
		
		
		super(name,gender);
		
		this.subjects = subjects;
		this.costperday = costperday;
		this.workingdays=workingdays;
		
	}
	@Override
	public int getNoofDaysWorked() {
		// TODO Auto-generated method stub
		return this.workingdays;
	}
	@Override
	public double getpriceperday() {
		// TODO Auto-generated method stub
		return this.costperday;
	}
	

}
