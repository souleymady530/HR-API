package com.hrapi.src.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrapi.src.Models.PosteHR;


@Repository
public interface PosteRepository extends CrudRepository<PosteHR, Long>
{

}
