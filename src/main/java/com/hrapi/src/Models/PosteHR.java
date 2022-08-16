package com.hrapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Id;
@Data
@Entity
@Table(name="Postes")
public class PosteHR
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private int idService;
	private String titre;
	private boolean disponible;
	
	
	
	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public int getIdService() {
		return idService;
	}



	public void setIdService(int idService) {
		this.idService = idService;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public boolean isDisponible() {
		return disponible;
	}



	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	@Override
	public String toString() {
		return "Poste [Id=" + Id + ", Service Numero=" + idService + ", titre=" + titre + ", disponible=" + disponible + "]";
	}
	
	
	
}
