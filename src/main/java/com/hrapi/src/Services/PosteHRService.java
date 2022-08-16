package com.hrapi.src.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrapi.src.Models.PosteHR;
import com.hrapi.src.Repositories.PosteRepository;

@Service
public class PosteHRService
{
	@Autowired
	private PosteRepository posteRepos;
	
	
	public Iterable<PosteHR> getAllPostes()
	{
		return posteRepos.findAll();
				
	}
	
	
	public Optional <PosteHR> getPosteById(Long Id)
	{
		Optional <PosteHR> poste=posteRepos.findById(Id);
		if(poste.get()!=null)
			return poste;
		return null;
	}
	
	
	public String savePoste(PosteHR poste)
	{
		String result="Entity Not Save";
		if(poste.getTitre()!=null)
		{
			posteRepos.save(poste);
			result="Entity Save";
		}
		else
			result="le titre est nul";
		return result;
	}
	
	public String updatePoste(PosteHR poste, Long Id)
	{
		String result="Entity Not Update";
	    Optional<PosteHR> posteFind=posteRepos.findById(Id);
	    if(posteFind.isPresent())
	    {
	    	PosteHR newPoste=posteFind.get();
	    	if(poste.getTitre()!=null)
	    		newPoste.setTitre(poste.getTitre());
	    	posteRepos.save(newPoste);
	    	result="Poste Update";
	    }
		
		return result;
	}
	
	public String deletePosteHR(Long id)
	{
		posteRepos.deleteById(id);
		
		return "Entity Delete";
	}
	
}
