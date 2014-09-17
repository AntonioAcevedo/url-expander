package com.relevante.urlexpander.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RelevanteConfiguration {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
