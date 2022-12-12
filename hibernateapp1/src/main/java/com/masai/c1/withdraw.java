package com.masai.c1;

public class withdraw {
	
	 public static void main(String[] args) {
		  AccountDao act=new AccountImpl();
			
			System.out.println(act.withdraw(3500, 1));
	}

}
