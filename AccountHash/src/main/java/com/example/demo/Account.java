package com.example.demo;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Account {

	String num6;
	String num8;
	String num10;

	public Account(AccountManager am) {
		num6 = genAccountNum(6);
		num8 = genAccountNum(8);
		num10 = genAccountNum(10);
	}

	private String genAccountNum(int length) {

		boolean newAccount = true;
		String generatedAccNum = "";
		Random ran = new Random();
		int letter = ran.nextInt(3);

		if (letter == 0) {
			generatedAccNum += "a";
		} else if (letter == 1) {
			generatedAccNum += "b";
		} else if (letter == 2) {
			generatedAccNum += "c";
		}

		while (newAccount) {
			for (int i = 0; i < length; i++) {
				generatedAccNum += ran.nextInt(10);
			}
			if (AccountManager.getAccount(generatedAccNum) == null)
				newAccount = false;
		}
		
		return generatedAccNum;
	}

	private String genAccountNum6() {

		String generatedAccNum = "";
		Random ran = new Random();
		int letter = ran.nextInt(3);

		if (letter == 0) {
			generatedAccNum += "a";
		} else if (letter == 1) {
			generatedAccNum += "b";
		} else if (letter == 2) {
			generatedAccNum += "c";
		}

		for (int i = 0; i < 6; i++) {
			generatedAccNum += ran.nextInt(10);
		}

		return generatedAccNum;

	}

	private String genAccountNum8() {

		String generatedAccNum = "";
		Random ran = new Random();
		int letter = ran.nextInt(3);

		if (letter == 0) {
			generatedAccNum += "a";
		} else if (letter == 1) {
			generatedAccNum += "b";
		} else if (letter == 2) {
			generatedAccNum += "c";
		}

		for (int i = 0; i < 8; i++) {
			generatedAccNum += ran.nextInt(10);
		}

		return generatedAccNum;

	}

	private String genAccountNum10() {

		String generatedAccNum = "";
		Random ran = new Random();
		int letter = ran.nextInt(3);

		if (letter == 0) {
			generatedAccNum += "a";
		} else if (letter == 1) {
			generatedAccNum += "b";
		} else if (letter == 2) {
			generatedAccNum += "c";
		}

		for (int i = 0; i < 10; i++) {
			generatedAccNum += ran.nextInt(10);
		}

		return generatedAccNum;
	}

	@Override
	public String toString() {
		return "6 digit account number: " + this.num6 + " 8 digit account number: " + this.num8
				+ " 10 digit account number: " + this.num10;

	}

}
