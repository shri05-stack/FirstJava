package com.globalpayex.bank.entities;

public enum AccType {
	SAVINGS("S"), // has an implicit integer value called as the ordinal(0)
	CURRENT("C"); // (1)
	
	private String actualvalue;
	AccType(String actualvalue){
		this.actualvalue=actualvalue;
		
	}
	public String getactualvalue() {
		return actualvalue;
	}

}
