package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberGenerator {
	
	@Autowired
	private AccountManager am = new AccountManager();
	
	public String genAccountNum(int length) {

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
			if (am.getAccount(generatedAccNum) == null)
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
}
