package fr.dawan.agentask.bean;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Sondage extends DbObject {
	private String Libelle;
	private HashMap<Integer , String> lstq = new HashMap<Integer , String>();
	private String description1;
	private Date date_de_debut;
	private Date date_de_fin1;
	
	@OneToMany(mappedBy = "sondage")
	private List<Reponse> listrep = new ArrayList<Reponse>();
	
	public Sondage(String libelle, HashMap<Integer, String> lstq, String description, Date date_de_debut,
			Date date_de_fin) {
		super();
		Libelle = libelle;
		this.lstq = lstq;
		this.description1 = description1;
		this.date_de_debut = date_de_debut;
		this.date_de_fin1 = date_de_fin1;
=======
import java.util.Date;
import java.util.HashMap;

public class Sondage {
	private int idSondage;
	private String Libelle;
	private HashMap<Integer , String> lstq = new HashMap<Integer , String>();
	private String description;
	private Date date_de_debut;
	private Date date_de_fin;
	
	public Sondage(int idSondage, String libelle, HashMap<Integer, String> lstq, String description, Date date_de_debut,
			Date date_de_fin) {
		super();
		this.idSondage = idSondage;
		Libelle = libelle;
		this.lstq = lstq;
		this.description = description;
		this.date_de_debut = date_de_debut;
		this.date_de_fin = date_de_fin;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	}
	public Sondage() {
		super();
	}
<<<<<<< HEAD
=======
	public int getIdSondage() {
		return idSondage;
	}
	public void setIdSondage(int idSondage) {
		this.idSondage = idSondage;
	}
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public HashMap<Integer, String> getLstq() {
		return lstq;
	}
	public void setLstq(HashMap<Integer, String> lstq) {
		this.lstq = lstq;
	}
	public String getDescription() {
<<<<<<< HEAD
		return description1;
	}
	public void setDescription(String description) {
		this.description1 = description;
=======
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	}
	public Date getDate_de_debut() {
		return date_de_debut;
	}
	public void setDate_de_debut(Date date_de_debut) {
		this.date_de_debut = date_de_debut;
	}
	public Date getDate_de_fin() {
<<<<<<< HEAD
		return date_de_fin1;
	}
	public void setDate_de_fin(Date date_de_fin) {
		this.date_de_fin1 = date_de_fin;
=======
		return date_de_fin;
	}
	public void setDate_de_fin(Date date_de_fin) {
		this.date_de_fin = date_de_fin;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	}
}
