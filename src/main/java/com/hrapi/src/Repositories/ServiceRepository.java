package com.hrapi.src.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.hrapi.src.Models.ServiceHR;



@Repository
public interface ServiceRepository extends CrudRepository<ServiceHR, Long> 
{

}
