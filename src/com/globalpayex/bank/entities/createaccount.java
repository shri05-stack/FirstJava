package com.globalpayex.bank.entities;

import com.globalpayex.bank.exception.MinBalNotMaintainedException;

public class createaccount {


	public static void main(String[] args) {
		Account a= new Account(ACCtype,"savings", 10000);
		a.getDetails().ifPresent
		Account emptyAccount = new Account(null,null,0);
		/*System.out.println(a.deposit(1000));
		try {
			System.out.println(a.withdraw(0));
		} catch (IllegalStateException e) {
		System.out.println(a.withdraw(5000));
		e.printStackTrace();
		
	} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}*/
		/*try {
			System.out.println(a.withdraw(900000));
		} catch (MinBalNotMaintainedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		

}
}
