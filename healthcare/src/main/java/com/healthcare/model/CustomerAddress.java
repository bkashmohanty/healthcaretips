package com.healthcare.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class CustomerAddress {
	
	@JsonProperty
	private String addressText;
	@JsonProperty
	private String pin;
	@JsonProperty
	private String country;
	@JsonProperty
	private String district;

}
