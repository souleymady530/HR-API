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

import com.hrapi.src.Models.Employe;
import com.hrapi.src.Services.EmployeService;

@RestController
public class EmployeController 
{

	@Autowired
	private EmployeService employeService;

	 @GetMapping("/Employes")
	public Iterable<Employe> getEmployees()
	{
		return employeService.getEmployees();
	}
	
	
	 @PostMapping("/Employe/save")
	 public Employe createEmploye(@RequestBody Employe employe)
	 {
		 return employeService.saveEmployee(employe);
	 }
	 
	 
	 @GetMapping("/Employe/{id}")
	 public Optional<Employe>  getEmploye(@PathVariable("id") final Long id)
	 {
		
		 
		 return employeService.getEmployee(id);
		 
	 }
	 
	 
	 @PutMapping("/Employe/{id}")
	 public Employe updateEmploye(@PathVariable("id") final Long id, @RequestBody Employe employe)
	 {
		 Optional<Employe> emp=employeService.getEmployee(id);
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
			
			employeService.saveEmployee(currentEmploye);
			return currentEmploye;
						
		 }
		 else
		 {
			 return null;
		 }
		
	 }
	 
	 @DeleteMapping("/Employe/{id}")
	 public void deleteEmploye (@PathVariable("id") final Long id)
	 {
		 employeService.deleteEmployee(id);
	 }
	 
}
