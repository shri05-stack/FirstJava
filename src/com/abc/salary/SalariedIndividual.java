package com.abc.salary;

public interface SalariedIndividual {
	int getNoofDaysWorked();
	double getpriceperday();
	
	public default double calculate() {
		int noOfDays = this.getNoofDaysWorked();	
		double costPerDay = this.getpriceperday();
		
		double costWithoutTax =noOfDays*costPerDay;
		int professionalTax=200;
		double costWithTdsDeducted=costWithoutTax - (0.1* costWithoutTax);
		return costWithTdsDeducted - professionalTax;
		
	}
	

}
