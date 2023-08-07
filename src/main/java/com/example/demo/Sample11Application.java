package com.example.demo;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Sample11Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample11Application.class, args);
	}

	@Configuration
	public static class SecurityConfiguration {
		@Bean
		public KeycloakConfigResolver keycloakConfigResolver() {
			return new KeycloakSpringBootConfigResolver();
		}
	}
}
