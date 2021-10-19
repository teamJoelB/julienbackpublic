package fr.julien.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Classe {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	
	@ManyToOne
	private User enseigant;

}
