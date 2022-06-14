package com.globalpayex.college.entities;

public class address {
	
		private String country;
		private int postalcode;
	    private String State;
		public void setaddress(String country, int postalcode, String state) {
			
			this.country = country;
			this.postalcode = postalcode;
			this.State = state;
		}
		public address(String country,int postalcode, String State)
		{ 
			this.country = country;
			this.postalcode = postalcode;
			this.State = State;
		}
		
		public address()
		{
			
		}
		
		public String getCountry()
		{
			return this.country;
		}
		
		public String getAddress()
		{
			return String.format("State: %s \nCountry: %s \nPostal Code: %s",
								this.State,this.country,this.postalcode);
		}

	    
}


