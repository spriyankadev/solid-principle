package com.test.DependencyInversion.solution;

public class CreditCard implements BankCard {

	public void doTransaction(long amount) {
		System.out.println("Payment using credit card");

	}
}
