package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.AccountException;
import com.masai.Exception.InsufficientFundException;
import com.masai.Model.Account;
import com.masai.Model.AccountDTO;
import com.masai.repo.Accountdao;

@Service
public  class AccountServiceImpl implements AccountService{

	@Autowired
	private Accountdao accdao;
	
	@Override
	public Account openAccount(Account acc) throws AccountException {
		// TODO Auto-generated method stub
		return accdao.save(acc);
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		if(accdao.findById(accno).isPresent()) {
			Account em=accdao.findById(accno).get();
			accdao.delete(em);
			
			return em;
		}
		else
			throw new AccountException("Not Avaialable");
	
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		if(accdao.findById(accno).isPresent()) {
			Account em=accdao.findById(accno).get();
			 em.setBalance(em.getBalance()+amount);
			
			return em;
		}
		else
			throw new AccountException("Not Avaialable");
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		if(accdao.findById(accno).isPresent()) {
			Account em=accdao.findById(accno).get();
			 if(em.getBalance()>amount) {
				 em.setBalance(em.getBalance()-amount);
				 return em;
			 }
			 else
				 throw new InsufficientFundException("fund not avaialble");
			
		}
		else
			throw new AccountException("Not Avaialable");
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		if(accdao.findById(dto.getSrcAccno()).isPresent()) {
			Account em=accdao.findById(dto.getSrcAccno()).get();
			 if(em.getBalance()>dto.getAmmount() && accdao.findById(dto.getDesAcccno()).isPresent()) {
				 em.setBalance(em.getBalance()-dto.getAmmount());
				 em.setBalance(em.getBalance()+dto.getAmmount());
				 
				 return "Sucessfully Transfer";
			 }
			 else
				 throw new InsufficientFundException("fund not avaialble");
			
		}
		else
			throw new AccountException("Not Avaialable");
	}



}
