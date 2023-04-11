package com.keerthana.selenium;

public class Bank {

	int balance = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		try {
			b.withDraw(150);	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	void withDraw(int amount) {

		if (balance < amount) {
			throw new RuntimeException("hdsjhd Low Balance");
		} else {
			balance = balance - amount;
		}

	}
}
