package com.atos.loyalty.service;

import com.atos.loyalty.model.CaseStudyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CaseStudyService {

	private final WebClient webClient;

	public CaseStudyService(WebClient webClient) {
		this.webClient = webClient;
	}

	public CaseStudyResponse obtenerCaseStudies() {
		final CaseStudyResponse caseStudyResponse = this.webClient.get().uri("casestudies/?format=json").retrieve()
				.bodyToMono(CaseStudyResponse.class).block();
		return caseStudyResponse;
	}
}
