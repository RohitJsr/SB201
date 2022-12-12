package com.masaiQ2;

public class Demo implements In1,In2 {

	@Override
	public void min(int a, int b) {
	System.out.println(a-b);
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}

	@Override
	public void plus(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.min(5, 4);
		d1.div(6, 18);
		d1.plus(10, 5);
		d1.mul(9, 5);
	}

}
