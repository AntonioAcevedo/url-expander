package com.relevante.urlexpander.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LongUrlServiceResponseJsonDTO 
{
	@JsonProperty(value="long-url")
	private String longUrl;
	
	public LongUrlServiceResponseJsonDTO() {}
	
	public String getLongUrl() {
		return longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

}
