package com.hrapi.src.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrapi.src.Models.ServiceHR;
import com.hrapi.src.Repositories.ServiceRepository;

@Service
public class ServiceHRService 
{
	@Autowired
	private ServiceRepository serviceRepos;
	
	public Iterable<ServiceHR> getAllServices()
	{
		return serviceRepos.findAll();
				
	}
	
	public Optional<ServiceHR> getById(final Long Id)
	{
		Optional<ServiceHR> serv=serviceRepos.findById(Id);
		if(serv.get()!=null)
			return serv;
		return null;
	}
	
	public String saveServiceHR(ServiceHR service)
	{
		String result="Entity Not Save";
	
		String titre=service.getTitre();
		if(titre!=null)
		{
			serviceRepos.save(service);
			result="Entity Save";
		}
		return result;
	
	}
	
	
	public String updateServiceHR(ServiceHR service, Long Id)
	{
		String result="Entity Not Update";
		Optional <ServiceHR> srv=serviceRepos.findById(Id);
		if(srv.isPresent())
		{
			ServiceHR currentService=srv.get();
			if(service.getTitre()!=null)
			{
				currentService.setTitre(service.getTitre());
				currentService.setNbrePoste(service.getNbrePoste());
				serviceRepos.save(currentService);
				result="Entity Update";
			}
		}
		return result;
	}
	
	public String deleteService(Long id)
	{
		String result="Entity Delete";
		serviceRepos.deleteById(id);
		return result;
	}
	
}
