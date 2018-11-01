package com.tmkcomputers.springbootrestapimonolith.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Encoders {
	@Bean

	public PasswordEncoder oauthClientPasswordEncoder() {
		return new BCryptPasswordEncoder(4);
	}

	@Bean
	public PasswordEncoder userPasswordEncoder() {
		System.out.println("Shhhhoiicicbnn dkdvk");
		return new BCryptPasswordEncoder(8);
	}
}
