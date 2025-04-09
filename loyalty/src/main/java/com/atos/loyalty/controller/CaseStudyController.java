package com.atos.loyalty.controller;

import com.atos.loyalty.model.CaseStudyResponse;
import com.atos.loyalty.service.CaseStudyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/casestudies")

public class CaseStudyController {

	private final CaseStudyService caseStudyService;

	public CaseStudyController(CaseStudyService caseStudyService) {
		this.caseStudyService = caseStudyService;
	}

	@GetMapping
	public CaseStudyResponse obtenerCaseStudies() {
		return this.caseStudyService.obtenerCaseStudies();
	}
}
