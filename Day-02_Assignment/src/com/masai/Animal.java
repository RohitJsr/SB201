package com.masai;

public abstract class Animal {
	private String name;

	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	abstract void makeNoise();
	
	void sleep() {
		System.out.println("Animal is slpeeping");
	}
	abstract void eat();
	
}
