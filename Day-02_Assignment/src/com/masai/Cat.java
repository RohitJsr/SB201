package com.masai;

public class Cat extends Animal {
	private String nickName;

	
	
	
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Cat(String nickName) {
		super();
		this.nickName = nickName;
	}

	public Cat() {
		super();
	}

	@Override
	void makeNoise() {
		System.out.println("Cat make noise meow");
		
	}

	@Override
	void eat() {
		System.out.println("cat is eating");
		
	}
	void jump() {
		System.out.println("Cat is jumping");
	}
	

}
