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
		mvc.perform(MockMvcRequestBuilders.get("/Postes").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk()).andExpect(jsonPath("$[0].titre",is("Comptable Adjoint 2")));
	}
	//Request:Poste/{id}     Type:GET
	@Test
	public void getPoste() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.get("/Poste/1").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
		
	//Request:Poste/save     Type:POST
	@Test
	public void savePoste() throws Exception
	{
		String URI="/Poste/save";
		String posteToSave = "{\"idService\": 1,\"titre\" : \"Comptable Adjoint 2\"}";
	    MockHttpServletRequestBuilder req = post(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(posteToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	}
	
	//Request:Poste/{id}     Type:PUT
	@Test
	public void updatePoste() throws Exception
	{
		String URI="/Poste/4";
		String posteToSave = "{\"idService\": 2,\"titre\" : \"CHEF MARKKETING\"}";
	    MockHttpServletRequestBuilder req = put(URI).contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON_UTF8)
	            .content(posteToSave);
	    this.mvc.perform(req).andExpect(status().isOk());
	}
		
	//Request:Poste/{id}     Type:DELETE
	
	@Test
	public void deletePoste() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.delete("/Poste/2").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}
}
