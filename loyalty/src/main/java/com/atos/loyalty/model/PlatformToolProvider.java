package com.atos.loyalty.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlatformToolProvider {

	@JsonProperty("provider")
	private String provider;

	@JsonProperty("logo")
	private String logo;

}
