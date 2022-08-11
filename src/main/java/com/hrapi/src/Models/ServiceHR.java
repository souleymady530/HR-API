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
public class ServiceHR
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
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbrePoste() {
		return nbrePoste;
	}
	public void setNbrePoste(int nbrePoste) {
		this.nbrePoste = nbrePoste;
	}
	
	
}
