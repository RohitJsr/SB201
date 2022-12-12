package com.masai.service;

import com.masai.Exception.AccountException;
import com.masai.Exception.InsufficientFundException;
import com.masai.Model.Account;
import com.masai.Model.AccountDTO;

public interface AccountService {
	
	public Account openAccount(Account acc)throws AccountException;
	public Account closeAccount(Integer accno)throws AccountException, AccountException;
	public Account depositAmount(Integer accno, Integer amount)throws
	AccountException;
	//after deposit amount return the updated Account object.
	public Account withdrawAmount(int accno, Integer amount)throws
	AccountException, InsufficientFundException;
	//after withdraw amount returns the updated Account object.
	//if the insufficient amount is there throw the InsufficientFundException with proper message
	//if Invalid accno is there then throw the AccountException with proper message
	public String transferAmount(AccountDTO dto)throws AccountException, InsufficientFundException,
	InsufficientFundException;
	//after successful transfer, returns the Sucess message.
	//if Invalid srcAccno and desAccno is there then throw the AccountException with proper
	//message
	//if the insufficient amount is there in destination account throw the InsufficientFundException
	//with proper message
}
