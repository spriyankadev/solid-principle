package com.test.DependencyInversion.problem;

public class ShoppingMall {
	// Payment type using debit card is tightly coupled with shopping mall
	// suppose if debit is not working we have to do changes here to add creditcard
	// dependency, & need to pass credit card instance, this is not recommended way to do implementation
	private DebitCard debitCard;

	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public void doPurchaseSomething(long amount) {
		debitCard.doTransaction(amount);

	}

	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPurchaseSomething(5000);
	}
}
