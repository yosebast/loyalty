package com.atos.loyalty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	private static final String BASE_URL = "https://nvg-dev.eviden.com/api/";

	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl(BASE_URL)
				.defaultHeader("Authorization", "Token 8284db556c4888d4e3679592208d0509fe517793")
				.defaultHeader("Username", "SP_WoW_Loyalty_PoC").defaultHeader("Password", "&%bUbGL5chOLaRdV").build();
	}
}
