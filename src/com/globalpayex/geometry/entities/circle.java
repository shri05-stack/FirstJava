package com.globalpayex.geometry.entities;

import com.abc.geometry.enitities.shape;

public abstract class circle extends shape {
	double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius;
	}

}
