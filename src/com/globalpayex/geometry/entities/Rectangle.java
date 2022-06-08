package com.globalpayex.geometry.entities;

public class Rectangle {
	float length;
	float breadth;
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	float area() {
		return length*breadth;
	}
	float perimeter() {
		return 2*(length+breadth);
	}

}
