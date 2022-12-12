package com.masai.c1;

public class findbyId {
	
		  public static void main(String[] args) {
				 AccountDao act=new AccountImpl();
				 System.out.println(act.findById(1));;
		  }

}
