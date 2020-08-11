package com.patientcare.admin;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.client.response.MockRestResponseCreators;

import com.patientcare.admin.controller.AdminController;

@RunWith(SpringRunner.class)
@SpringBootTest
class AdminApplicationTests {
	
	@Autowired
	AdminController adminController;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void getAllPillboxesTest() throws Exception {
		MockRestServiceServer mockServer = MockRestServiceServer.createServer(adminController.restTemplate);
		
		mockServer
	    .expect(MockRestRequestMatchers.requestTo(new URI("http://localhost:8081/getAllPillboxes")))
	    .andExpect(MockRestRequestMatchers.method(HttpMethod.GET))
	    .andRespond(MockRestResponseCreators.withStatus(HttpStatus.OK)
	        .contentType(MediaType.APPLICATION_XML)
	        .body("success"));
		
		adminController.getAllPillboxes();
		
	}

}
