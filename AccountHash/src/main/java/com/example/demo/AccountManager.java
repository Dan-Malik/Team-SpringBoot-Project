package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountManager {
	

	private HashMap<String, Account> accounts = new HashMap<String, Account>();


	public void setAccounts(HashMap<String, Account> accounts) {
		this.accounts = accounts;
	}

	public void storeAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}

	public Account getAccount(String accNumber) {

		return accounts.get(accNumber);

	}
}
