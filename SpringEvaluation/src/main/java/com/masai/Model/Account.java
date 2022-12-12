package com.masai.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer accountNo;
	private String accountHolderName;
	private String address;
	private Integer balance;
	private String moblile;
	public Account(Integer accountNo, String accountHolderName, String address, Integer balance, String moblile) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.balance = balance;
		this.moblile = moblile;
	}
	public Account() {
		super();
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getMoblile() {
		return moblile;
	}
	public void setMoblile(String moblile) {
		this.moblile = moblile;
	}
	
	
}
