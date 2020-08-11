package com.patientcare.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class AdminController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Value("${PILLBOX_API}")
	private String PILLBOX_API;
	
	private String GET_PILLBOX_PATH = "/getAllPillboxes";
	
	@RequestMapping(value = { "/getAllPillboxes" }, method = RequestMethod.GET)
	public ResponseEntity<String> getAllPillboxes() {
		String url = PILLBOX_API + GET_PILLBOX_PATH;
		
		String resp = restTemplate.getForObject(url, String.class);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
				
	}

}
