package com.hrapi.src;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.hrapi.src.Services.ServiceHRService;

@SpringBootTest
@AutoConfigureMockMvc
public class ServiceControllerTest
{

	//Entity:ServiceControllerTest
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ServiceHRService service;
	
	
	//Request: /Service Type:GET
	@Test
	public void getServices() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.get("/Services").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andExpect(jsonPath("$[0].titre",is("Netoyage")));
	}
	
	//Request : /Service/{id} Type:GET
	@Test
	public void getService() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.get("/Service/1").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
	//Request: /Service/save Type:POST
	@Test
	public void saveService() throws Exception
	{
		String URI="/Service/save";
		String serviceToSave = "{\"nbre_poste\": 0,\"titre\" : \"Netoyage\"}";
	    MockHttpServletRequestBuilder req = post(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(serviceToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	}
	
	//Request: /Service/{id} Type:UPDATE
	@Test
	public void updateService() throws Exception
	{
		String URI="/Service/4";
		String serviceToSave = "{\"nbre_poste\": 2,\"titre\" : \"Netoyage\"}";
	    MockHttpServletRequestBuilder req = put(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(serviceToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	}
	
	//Request: /Service/{id} Type:DELETE
	@Test
	public void deleteService() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.delete("/Service/1").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
	
}
