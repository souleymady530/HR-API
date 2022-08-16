package com.hrapi.src.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrapi.src.Models.PosteHR;
import com.hrapi.src.Services.PosteHRService;

@RestController
public class PosteController 
{

	@Autowired
	PosteHRService posteHRService;
	
	@GetMapping("/Postes")
	public Iterable<PosteHR> getPoste()
	{
		return posteHRService.getAllPostes();
	}
	
	
	@GetMapping("/Poste/{Id}")
	public Optional<PosteHR> getPoste(@PathVariable("Id") final Long id)
	{
		return posteHRService.getPosteById(id);
	}
	
	
	@PostMapping("/Poste/save")
	public String savePoste(@RequestBody PosteHR poste)
	{
		return posteHRService.savePoste(poste);
	}
	
	@PutMapping("/Poste/{Id}")
	public String updatePoste(@PathVariable("Id") final Long id, PosteHR poste)
	{
		return posteHRService.updatePoste(poste, id);
	}
	
	@DeleteMapping("/Poste/{Id}")
	public String deletePosteHR(@PathVariable("Id") final Long id)
	{
		return posteHRService.deletePosteHR(id);
	}
}
