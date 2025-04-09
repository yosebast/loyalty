package com.atos.loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CaseStudyResponse {
	@JsonProperty("total_count")
	private int totalCount;

	private int count;

	@JsonProperty("has_next")
	private boolean hasNext;

	@JsonProperty("has_previous")
	private boolean hasPrevious;

	private int number;

	@JsonProperty("next_page_number")
	private Integer nextPageNumber;

	@JsonProperty("previous_page_number")
	private Integer previousPageNumber;

	@JsonProperty("num_pages")
	private int numPages;
	@JsonProperty("next")
	private String next;
	@JsonProperty("previous")
	private String previous;
	@JsonProperty("results")
	private List<CaseStudy> results;
}
