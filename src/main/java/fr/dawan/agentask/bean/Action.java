package fr.dawan.agentask.bean;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Action extends DbObject {
	private String titre;
	private String description;
	private Date date_debut;
	private Date date_fin;
	private String lieu;
	
	//--------------------------------------------------------------------------------//
<<<<<<< HEAD
 
=======

>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	public Action(String titre, String description, Date date_debut, Date date_fin, String lieu) {
		super();
		this.titre = titre;
		this.description = description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.lieu = lieu;
	}
	public Action() {
		super();
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
