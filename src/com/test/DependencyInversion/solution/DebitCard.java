package com.test.DependencyInversion.solution;

public class DebitCard implements BankCard {

	public void doTransaction(long amount) {
		System.out.println("Payment using debit card");
	}
}
