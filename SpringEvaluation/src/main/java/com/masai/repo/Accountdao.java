package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Account;

public interface Accountdao extends JpaRepository<Account,Integer>{

}
