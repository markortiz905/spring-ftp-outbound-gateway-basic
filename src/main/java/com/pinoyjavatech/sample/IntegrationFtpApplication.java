package com.pinoyjavatech.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class IntegrationFtpApplication implements ApplicationRunner {
	
	@Autowired
	private OutFileGateway fileGateway;

	public static void main(String[] args) {
		SpringApplication.run(IntegrationFtpApplication.class, args);
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		fileGateway.read("test/testsfile");
	}

}
