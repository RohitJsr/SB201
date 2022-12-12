package com.masai.Junit;

public class AppRunner {
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		System.out.println("Addition is -"+cal.add(12, 23));
		System.out.println("Multiplication is- "+cal.multiply(12, 2));
	}

}
