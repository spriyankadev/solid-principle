package com.test.solid.SingleResponsibility.solution;

public class NotificationService {
	public void sendOTP(String medium) {
		if(medium.equals("email")) {
			//write email related logic
		}
		if(medium.equals("mobile")) {
			//write email related logic
		}
	}
	
}
