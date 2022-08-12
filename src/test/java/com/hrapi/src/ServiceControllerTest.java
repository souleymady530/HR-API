package com.hrapi.src;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

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
		
	}
	
	//Request : /Service/{id} Type:GET
	@Test
	public void getService() throws Exception
	{
		
	}
	
	//Request: /Service/save Type:POST
	@Test
	public void saveService() throws Exception
	{
		
	}
	
	//Request: /Service/{id} Type:UPDATE
	@Test
	public void updateService() throws Exception
	{
		
	}
	
	//Request: /Service/{id} Type:DELETE
	@Test
	public void deleteService() throws Exception
	{
		
	}
	
}
