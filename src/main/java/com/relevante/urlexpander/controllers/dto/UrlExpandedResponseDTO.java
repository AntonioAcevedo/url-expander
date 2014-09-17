package com.relevante.urlexpander.controllers.dto;

public class UrlExpandedResponseDTO 
{
	private String shortUrl;
	private String longUrl;
	
	public UrlExpandedResponseDTO() {}

	public UrlExpandedResponseDTO(String shortUrl, String longUrl) {
		this.shortUrl = shortUrl;
		this.longUrl = longUrl;
	}
	
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getLongUrl() {
		return longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

}
