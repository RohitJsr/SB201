package com.masai.c1;

public interface AccountDao {
	Account findById(int id);
	String save(Account account);
	String remove(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);

}
