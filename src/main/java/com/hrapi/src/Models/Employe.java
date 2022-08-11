package com.hrapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employes")
public class Employe {

	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	private String firstName;
	private String lastName;
	private String mail;
	private String motDePasse;
	private int idPoste;
	@Override
	public String toString() {
		return "Employe [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", motDePasse=" + motDePasse + ", idPoste=" + idPoste + "]";
	}
	
	
}
