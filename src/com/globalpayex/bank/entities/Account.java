package com.globalpayex.bank.entities;

import java.util.Optional;
import com.globalpayex.bank.exception.MinBalNotMaintainedException;
import static com.globalpayex.bank.entities.*;

public class Account {
	//forced encapsulation
	
	//as convention and to ensure that your java classes work seamlessly with the frameworks/Libraries used.
	//1. all instance attributes must be declared as a private
	//2. all instance attributes must have public getter/setter methods.
	
	
	int accounts;
	//private String accounttype;
	private AccType accType;
	private double balance;
	public String accNumber;
	
	public Account(int accountno, String accounttype, double balance) {
		this.accounts=accounts;
		this.accType= accounttype;
		this.balance= balance;
		
	}
	//setter method
	public void setAccType(String accType) {
		if(accType.equals("Savings") || accType.equals("Current")) {
			this.accType=accType;
		}
		else {
			throw new IllegalArgumentException("accType must be one of the following: Savings/Current");
		}
	}
	
	
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		if(balance<1000) {
			throw new IllegalArgumentException("balance to be 1000 or more");
		}
		this.balance = balance;
	}
	//getter method
	public String getAcctype() {
		return this.accType.toUpperCase();	
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
	
	public Optional<String> getDetails(){
		if(this.accNumber!=null && !this.accNumber.equals("")&& !(this.accType !=null) && !this.accounttype())
		{
				return Optional.of(String.format("Acc NO %s Acc Type %s Bal %d ", this.accNumber,this.acctype.ordinal(),this.balance));
		}
	}
		
	public Optional<String> getDetails(){
		if(this.accNumber!=null && !this.accNumber.equals("")&& !(this.accType !=null) && !this.accounttype())
		{
			return Optional.of(String.format("Acc NO %s Acc Type %s Bal %d ", this.accNumber,this.accType.ordinal(),this.balance));
		}
		return Optional.empty();
	}
	
	
}
	/*private boolean accounttype() {
		// TODO Auto-generated method stub
		return false;
	}*/
	public boolean hasInterest() {
		return this.accType==AccType.SAVINGS;
	}
	
}