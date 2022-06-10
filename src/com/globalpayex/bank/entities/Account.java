package com.globalpayex.bank.entities;

import com.globalpayex.bank.exception.MinBalNotMaintainedException;

public class Account {
	int accounts;
	String accounttype;
	double balance;
	
	public Account(int accountno, String accounttype, double balance) {
		this.accounts=accounts;
		this.accounttype= accounttype;
		this.balance= balance;
		
	}
	public double withdraw(double amt) throws MinBalNotMaintainedException {
		System.out.println("transaction starts...");
		try {
		if(amt<=0) {
			//throw new IllegalStateException("withdraw cannot be negative");
			throw new MinBalNotMaintainedException("withdraw cannot be negative");
		}
		
		if(this.balance - amt<1000) {
			throw new MinBalNotMaintainedException("balance cannot go below 10000");
			
		}
		this.balance-=amt;
		return this.balance;
	} finally {
		System.out.println("transaction ends...");
	}
	
	
	
	
}
}