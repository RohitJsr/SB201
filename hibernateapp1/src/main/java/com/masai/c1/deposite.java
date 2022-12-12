package com.masai.c1;

public class deposite {
	 public static void main(String[] args) {
		  AccountDao act=new AccountImpl();
			
			System.out.println(act.deposit(5000, 3));
	}

}
