package com.krish.domain_alert_system;

import org.springframework.boot.SpringApplication;

public class TestDomainAlertSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(DomainAlertSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
