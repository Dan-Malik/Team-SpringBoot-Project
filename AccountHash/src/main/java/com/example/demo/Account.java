package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Account {

	private String accountNumber;
	
	@Autowired
	private NumberGenerator numGen = new NumberGenerator();

	public Account() {
		this.accountNumber = numGen.genAccountNum(6);
	}

	@Override
	public String toString() {
		return "Account number: " + this.accountNumber;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
