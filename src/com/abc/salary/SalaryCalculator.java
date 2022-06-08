package com.abc.salary;
@Deprecated
public class SalaryCalculator {
	public static double calculate(SalariedIndividual salariedIndividual) {
		int noOfDays = salariedIndividual.getNoofDaysWorked();	
		double costPerDay = salariedIndividual.getpriceperday();
		
		double costWithoutTax =noOfDays*costPerDay;
		int professionalTax=200;
		double costWithTdsDeducted=costWithoutTax - (0.1* costWithoutTax);
		return costWithTdsDeducted - professionalTax;
		}

}
