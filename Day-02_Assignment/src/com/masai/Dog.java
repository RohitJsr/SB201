package com.masai;

public class Dog extends Animal{

	private String breed;
	
	
	
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public Dog() {
		super();
	}

	@Override
	void makeNoise() {
		System.out.println("Dog is barking");
		
	}

	@Override
	void eat() {
		System.out.println("Dog is eating");
		
	}
	void play() {
		System.out.println("Dog is playing");
	}

}
