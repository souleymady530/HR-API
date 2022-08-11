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
	
	public Optional<Employe> getEmployee(final Long id)
	{
		return eRepos.findById(id);
		
	}
	
	
	public Iterable<Employe> getEmployees()
	{
		return eRepos.findAll();
	}
	
	public void deleteEmployee(final Long id)
	{
		eRepos.deleteById(id);
		
	}
	
	public Employe saveEmployee(Employe emp)
	{
		Employe savedEmp=eRepos.save(emp);
		return savedEmp;
	}
}
