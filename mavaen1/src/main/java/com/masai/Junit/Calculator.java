package com.masai.Junit;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int multiply(Object val1, Object val2) {
		int v1=0, v2=0;
		if(val1 instanceof Integer && val2 instanceof Integer) {
			v1=(Integer)val1;
			v2=(Integer)val2;
		}else {
			throw new  ClassCastException("please inter valid num");
		}
		
		return vl*v2;
	}
}
