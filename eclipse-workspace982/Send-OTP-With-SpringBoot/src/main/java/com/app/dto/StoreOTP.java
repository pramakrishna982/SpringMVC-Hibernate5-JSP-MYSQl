package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class StoreOTP {
	private static int otp;

	public static int getOtp() {
		return otp;
	}

	public static void setOtp(int otp) {
		StoreOTP.otp = otp;
	}
}