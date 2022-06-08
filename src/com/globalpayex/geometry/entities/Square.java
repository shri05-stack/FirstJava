package com.globalpayex.geometry.entities;

public class Square {
	float s;
	
	public Square(float s) {
		super();
		this.s = s;
	}
	public float area() {
		return s*s;
	}
	
	public float perimeter() {
		return 4*s;
	}
}
	


