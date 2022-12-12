package com.masaiQ3_i;

import com.masaiQ3.Shape;

public class Circle extends Shape { 
	protected void display() {
		System.out.println("Display-derived");
		}
	public static void main(String[] args) {
		Circle c1= new Circle();
		c1.display();
	}
	//B. public and protected both can be used.
	/*
	 	a. Only protected can be used.
		B. public and protected both can be used.
		C. public, protected, and private can be used.
		d. Only public can be used
	 */

	

}
