package com.masai.c1;

public class save {
	  public static void main(String[] args) {
		  AccountDao act=new AccountImpl();
			Account a=new Account(9,"lohit@gmail.com","mumbai",56000.00);
			System.out.println(act.save(a));
	}
}
