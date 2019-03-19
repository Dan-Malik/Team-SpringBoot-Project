package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AccountHashApplication {

	public static void main(String[] args) {
	ApplicationContext ac =	SpringApplication.run(AccountHashApplication.class, args);
	AccountManager am = (AccountManager)ac.getBean("accountManager");
	
	Account jim = (Account) ac.getBean("account");
	Account dave = (Account) ac.getBean("account");
	
	am.storeAccount(dave);
	am.storeAccount(jim);
	
	System.out.println(am.getAccount(dave.num6).toString());
	System.out.println(am.getAccount(jim.num6).toString());
	
	}

}
