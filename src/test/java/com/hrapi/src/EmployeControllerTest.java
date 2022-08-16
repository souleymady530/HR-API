package com.hrapi.src;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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

import com.hrapi.src.Services.EmployeService;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeControllerTest
{
	//Entity: EmployeController

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	EmployeService employeService;

	//  Request: /Employes
	@Test
	public void getEmployes() throws Exception 
	{
		
		mvc.perform(get("/Employes")).andExpect(status().isOk()).andExpect(jsonPath("$[0].NAME", is("Zango")));
		
	}
	
	
	//Request /Employe/{id}
	@Test
	public void getEmployeById() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.get("/Employe/2").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
	}
	
	
	//Request Employe/save Type:POST
	@Test
	public void saveEmpoye() throws Exception
	{
		String URI="/Employe/save";
		String employeToSave = "{\"first_name\": \"Porgo\",\"last_name\" : \"Valentin RicheLieu\",\"mail\":\"valentinoRichelieu@gmail.com\",\"mot_de_passe\":\"Nadaa\"}";
	    MockHttpServletRequestBuilder req = post(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(employeToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	}
	
	
	//Request Employe/{id} Type: PUT
	@Test
	public void updateEmploye() throws Exception
	{
		String URI="/Employe/4";
		String employeToSave = "{\"first_name\": \"PorgoT\",\"last_name\" : \"Valentin RicheLieu\",\"mail\":\"valentinoRichelieu@gmail.com\",\"mot_de_passe\":\"Nadaa\"}";
	    MockHttpServletRequestBuilder req = put(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(employeToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	    
	}
	
	
	//Request Employe/{id} type:DELETE
	@Test
	public void deleteEmploye() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.delete("/Employe/1").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
}
