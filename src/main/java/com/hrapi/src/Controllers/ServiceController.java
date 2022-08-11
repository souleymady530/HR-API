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

import com.hrapi.src.Models.ServiceHR;
import com.hrapi.src.Services.ServiceHRService;

@RestController
public class ServiceController
{
	@Autowired
	private ServiceHRService serviceHRService;
	
	@GetMapping("/Services")
	public Iterable <ServiceHR> getServices()
	{
		return serviceHRService.getAllServices();
	}
	
	@GetMapping("/Service/{id}")
	public Optional<ServiceHR> getService(@PathVariable("Id") Long Id)
	{
		return serviceHRService.getById(Id);
	}
	
	@PostMapping("/Service/save")
	public String saveService(@RequestBody ServiceHR service)
	{
		return serviceHRService.saveServiceHR(service);
	}
	
	
	@PutMapping("/Service/{id}")
	public String updateService(@PathVariable("Id") final Long Id,@RequestBody ServiceHR srv)
	{
		return serviceHRService.updateServiceHR(srv, Id);
	}
	
	@DeleteMapping("Service/{i}")
	public String deleteService(@PathVariable("Id") final Long Id)
	{
		return serviceHRService.deleteService(Id);
	}

}
