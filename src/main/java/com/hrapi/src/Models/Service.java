package com.hrapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Id;
@Data
@Entity
@Table(name="Services")
public class Service
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String titre;
	private int nbrePoste;
	@Override
	public String toString() {
		return "Service :" + titre + ", nbrePoste=" + nbrePoste + "]";
	}
	
	
}
