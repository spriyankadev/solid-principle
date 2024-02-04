package com.test.OpenClose.problem;

public class NotificationService {
	public void sendOTP(String medium) {
		
		if (medium.equals("email")) {
			// write email related logic
		}
		if (medium.equals("mobile")) {
			// write email related logic
		}

		// In future if we need to add what send otp to whatsapp the we've to modify
		// this class
	}

}
