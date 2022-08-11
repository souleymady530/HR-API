package com.hrapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Postes")
public class Poste
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private int idService;
	private String titre;
	private boolean disponible;
	
	@Override
	public String toString() {
		return "Poste [Id=" + Id + ", Service Numero=" + idService + ", titre=" + titre + ", disponible=" + disponible + "]";
	}
	
	
}
