package com.hrapi.src.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrapi.src.Models.Employe;


@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {

}
