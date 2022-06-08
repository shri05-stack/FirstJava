package com.abc.geometry;

import com.abc.geometry.enitities.shape;
import com.globalpayex.geometry.entities.Square;

public class shapestatstics {
	public static void print(shape shape) {
		System.out.println("********** Statistics ********");
		System.out.println(String.format("area is %s", shape.area()));
		System.out.println(String.format("perimeter is %s", shape.perimeter()));
		System.out.println("********* statistics *******");
		
		
	}

}
