package com.pinoyjavatech.sample;

import java.io.File;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

public class CustomGatewayTransformer{

	public File handleMessage(Message<String> message) throws MessagingException {
		return new File(message.getPayload());
	}
	
	

}
