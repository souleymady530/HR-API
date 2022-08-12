package com.hrapi.src;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
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
		mvc.perform(MockMvcRequestBuilders.get("/Employes").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
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
		
	}
	
	
	//Request Employe/{id} Type: PUT
	@Test
	public void updateEmploye() throws Exception
	{
		
	}
	
	
	//Request Employe/{id} type:DELETE
	@Test
	public void deleteEmploye() throws Exception
	{
		
	}
}
