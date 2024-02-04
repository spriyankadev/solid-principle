package com.test.DependencyInversion.solution;

public class ShoppingMall {
	
	// Now we can pass any type of cards, i.e interface concrete implementation, this is loosely coupled
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);

	}

	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}
}
