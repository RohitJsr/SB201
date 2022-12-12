package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masai.Exception.AccountException;
import com.masai.Exception.InsufficientFundException;
import com.masai.Model.Account;
import com.masai.Model.AccountDTO;
import com.masai.service.AccountService;

@RequestMapping("Acc")
public class MyController {

	@Autowired
	private AccountService accser;
	
	@PostMapping("/account")
	public Account openAccount(@RequestBody Account acc)throws AccountException {
		return accser.openAccount(acc);
	}
		
	@DeleteMapping("/account/{accno}")
	public Account closeAccountHandler(@PathVariable Integer accno)throws AccountException{
		
		return accser.closeAccount(accno);
	}
	
	@PutMapping("/dep/{accno}/{amount}")
	public Account depositAmountHandler(@PathVariable Integer accno,@PathVariable Integer amount)throws
	AccountException{
		
		return accser.depositAmount(accno, amount);
		
	}

	@PutMapping("/with/{accno}/{amount}")
	public Account withdrawAmmountHandler(int accno, Integer amount)throws
	AccountException, InsufficientFundException{
		
		return accser.withdrawAmount(accno, amount);
		
	}
	
	@PostMapping("/acctdto")
	public String transferAmountHandler(@RequestBody  AccountDTO dto)throws AccountException,
	InsufficientFundException{
		return accser.transferAmount(dto);
	
}
}
