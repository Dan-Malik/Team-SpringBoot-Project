package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class AccountManager {

	private static HashMap<String, Account> accounts = new HashMap<String, Account>();

	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	static public void setAccounts(HashMap<String, Account> accounts) {
		accounts = accounts;
	}
	
	static public void storeAccount(Account account) {
		accounts.put(account.num6, account);
		accounts.put(account.num8, account);
		accounts.put(account.num10, account);
	}
	
	static public Account getAccount(String accNumber) {
		
		return accounts.get(accNumber);

	}
}
