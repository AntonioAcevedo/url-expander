package com.relevante.urlexpander.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.relevante.urlexpander.controllers.dto.LongUrlServiceResponseJsonDTO;
import com.relevante.urlexpander.controllers.dto.UrlExpandedResponseDTO;

@Controller
public class GreetingController {

	private static final String LONGURL_API_ENDPOINT = "http://api.longurl.org/v2/expand?url={url}&format=json";
	
	@Autowired private RestTemplate restTemplate;
	
	@RequestMapping("/")
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return "greeting";
    }
	
	@RequestMapping(value = "/urls", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UrlExpandedResponseDTO getExpandedUrl(@RequestParam(value="url", required=true) String urlToBeExpanded) 
	{
		LongUrlServiceResponseJsonDTO result = restTemplate.getForObject(LONGURL_API_ENDPOINT, LongUrlServiceResponseJsonDTO.class,urlToBeExpanded);
        return new UrlExpandedResponseDTO(urlToBeExpanded, result.getLongUrl());
    }
}