package com.hrapi.src.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrapi.src.Models.Employe;
import com.hrapi.src.Repositories.EmployeRepository;


@Service
public class EmployeService
{

	@Autowired
	private EmployeRepository eRepos;
	
	
	//Return an unique entity identified by id
	public Optional<Employe> getEmployee(final Long id)
	{
		return eRepos.findById(id);
		
	}
	
	
	
	//return all entities
	public Iterable<Employe> getEmployees()
	{
		return eRepos.findAll();
	}
	
	
	//delete an entity identified by id
	public String deleteEmployee(final Long id)
	{
		String result="Entity Delete";
		eRepos.deleteById(id);
		return result;
		
	}
	
	
	//save entity
	public String saveEmployee(Employe employe)
	{
		
		
		String result="Entity Not Save";
		
			
			 
			 String firstname=employe.getFirstName();
			 if(firstname!=null)
			 {
				 String lastname=employe.getLastName();
				 if(lastname!=null)
				 {
					 String mail=employe.getMail();
						if(mail!=null)
						{
							String password=employe.getMotDePasse();
							if(password!=null)
							{
								eRepos.save(employe);
								result="Entity Save";
							}
							else
							{
								result="Entity Save| Error: password";
							}
						}
						else
						{
							result="Entity Save| Error: mail";
						}
				 }
				 else
				 {
					 result="Entity Save| Error: lastName"; 
				 }
			 }
			 else
			 {
				 result="Entity Save| Error: firstName";
			 }
			 
					
			
		
		return result;
	}
	
	public String updateEmploye(final Long id,Employe employe)
	{
		String result="Entity Not Updaye";
		 Optional<Employe> emp=eRepos.findById(id);
		 if(emp.isPresent())
		 {
			 Employe currentEmploye=emp.get();
			 
			 String firstname=employe.getFirstName();
			 if(firstname!=null)
				 currentEmploye.setFirstName(firstname);
			 
			 String lastname=employe.getLastName();
			 if(lastname!=null)
				 currentEmploye.setLastName(lastname);
			 
			String mail=employe.getMail();
			if(mail!=null)
				currentEmploye.setMail(mail);
			
			String password=employe.getMotDePasse();
			if(password!=null)
				currentEmploye.setMotDePasse(password);
			
		
			result=	this.saveEmployee(currentEmploye);
						
		 }
		 
			 return result;
		
	}
}
