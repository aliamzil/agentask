package fr.dawan.agentask.bean;

import java.util.Date;

public class Action {
	private String titre;
	private String description;
	private Date date;
	private int duree; //durée en minutes
	private String lieu;
	public Action(String titre, String description, Date date, int duree, String lieu) {
		super();
		this.titre = titre;
		this.description = description;
		this.date = date;
		this.duree = duree;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
}
