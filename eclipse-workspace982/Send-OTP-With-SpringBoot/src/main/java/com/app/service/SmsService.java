package com.app.service;

import java.text.ParseException;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import com.app.dto.SmsPojo;
import com.app.dto.StoreOTP;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {
	
	private final String ACCOUNT_SID = "AC8aa9f0d70fd8ade61015c1a5dc004fb4";
	private final String AUTH_TOKEN = "cab2115c6915883a998265bd2a97e620";
	private final String FROM_NUMBER = "+18608463428";
//private final Stringn I dont want to change this  go to twilio
	
	public void send(SmsPojo sms) throws ParseException {   // the sms is going to send given mNO
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		int min = 100000;
		int max = 999999;
		int number = (int) (Math.random() * (max - min + 1) + min);
		
		String msg = "Your OTP - " + number + " please verify this OTP in your Application";
		
		Message message = Message.creator(new PhoneNumber(sms.getPhoneNo()), new PhoneNumber(FROM_NUMBER), msg)
				.create();
		StoreOTP.setOtp(number);
	}

	public void receive(MultiValueMap<String, String> smscallback) {
	}
}
