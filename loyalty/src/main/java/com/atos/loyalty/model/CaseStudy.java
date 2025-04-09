package com.atos.loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CaseStudy {

	@JsonProperty("id")
	private int id;

	@JsonProperty("industry")
	private String industry;

	@JsonProperty("case_study_visability")
	private String caseStudyVisibility;

	@JsonProperty("case_study_url")
	private String caseStudyUrl;

	@JsonProperty("platform_tools")
	private List<PlatformTool> platformTools;

	@JsonProperty("platform_tools_providers")
	private List<PlatformToolProvider> platformToolsProviders;

	@JsonProperty("set_as_featured")
	private boolean setAsFeatured;

	private boolean reviewed;

	@JsonProperty("date_approved")
	private String dateApproved;

	@JsonProperty("approval_notes")
	private String approvalNotes;

	private String title;

	@JsonProperty("company_name")
	private String companyName;

	@JsonProperty("redacted_company_name")
	private String redactedCompanyName;

	@JsonProperty("company_logo")
	private String companyLogo;

	@JsonProperty("short_description")
	private String shortDescription;

	@JsonProperty("challenge_description")
	private String challengeDescription;

	@JsonProperty("solution_description")
	private String solutionDescription;

	@JsonProperty("value_description")
	private String valueDescription;

	@JsonProperty("webinar_link")
	private String webinarLink;

	@JsonProperty("public_use_case")
	private String publicUseCase;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("updated_at")
	private String updatedAt;

	private int category;

	@JsonProperty("reviewed_by")
	private Integer reviewedBy;

	private int contact;

	@JsonProperty("created_by")
	private int createdBy;

	@JsonProperty("updated_by")
	private int updatedBy;

	private List<Integer> tags;

	@JsonProperty("plat_tools")
	private List<Integer> platTools;
}
