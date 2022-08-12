package com.hrapi.src;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.hrapi.src.Services.PosteHRService;

@SpringBootTest
@AutoConfigureMockMvc
public class PosteControllerTest 
{

	//Entity PosteHRService
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private PosteHRService posteService;
	
	//Request:/Poste     Type: GET
	@Test
	public void getPostes() throws Exception
	{
		
	}
	//Request:Poste/{id}     Type:GET
	@Test
	public void getPoste() throws Exception
	{
		
	}
		
	//Request:Poste/save     Type:POST
	@Test
	public void savePoste() throws Exception
	{
		
	}
	
	//Request:Poste/{id}     Type:PUT
	@Test
	public void updatePoste() throws Exception
	{
		
	}
		
	//Request:Poste/{id}     Type:DELETE
	@Test
	public void deletePoste() throws Exception
	{
		
	}
}
