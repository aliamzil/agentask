package fr.dawan.agentask.bean;

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
	}
	public Sondage() {
		super();
	}
	public int getIdSondage() {
		return idSondage;
	}
	public void setIdSondage(int idSondage) {
		this.idSondage = idSondage;
	}
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
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_de_debut() {
		return date_de_debut;
	}
	public void setDate_de_debut(Date date_de_debut) {
		this.date_de_debut = date_de_debut;
	}
	public Date getDate_de_fin() {
		return date_de_fin;
	}
	public void setDate_de_fin(Date date_de_fin) {
		this.date_de_fin = date_de_fin;
	}
	public void modif() {
		
	}
	public void bilansondage() {
		
	}
}
