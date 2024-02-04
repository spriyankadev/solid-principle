package com.test.solid.SingleResponsibility.problem;

public class BankService {

	public long deposit(long amount, String accountNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public long withdraw(long amount, String accountNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printPassbook() {
		// TODO Auto-generated method stub

	}
	//This class has too many responsibity to perform, we create separate class like printerService 

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {

		}
		if (loanType.equals("personalLoan")) {

		}
		if (loanType.equals("car")) {

		}

	}
	
	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//write email related logic
		}
	}
	
	//In future we might want to add sendOTP feature using mobile sms, whatsapp, then we'll have to change the code
}
