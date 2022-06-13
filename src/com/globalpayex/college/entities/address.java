package com.globalpayex.college.entities;

public class address {
	
		public String country;
		public int postalcode;
	    public String State;
		public address(String country, int postalcode, String state) {
			super();
			this.country = country;
			this.postalcode = postalcode;
			this.State = state;
		}
		public String getCountry() {
			return this.country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getPostalcode() {
			return this.postalcode;
		}
		public void setPostalcode(int postalcode) {
			this.postalcode = postalcode;
		}
		public String getState() {
			return this.State;
		}
		public void setState(String state) {
			State = state;
		}
	    
		public int getDetails() {
			return this.postalcode;
		}
	    
	    
}


