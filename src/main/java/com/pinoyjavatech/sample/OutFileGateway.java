package com.pinoyjavatech.sample;

public interface OutFileGateway {

	public void write(String fileName, String payload);
	
	public void read(String fileName);
}
