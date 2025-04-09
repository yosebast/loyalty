package com.atos.loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlatformTool {
	@JsonProperty("id")
	private int id;
	@JsonProperty("tool")
	private String tool;
}
