package fr.dawan.agentask.bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Evenement {
	private String nom;
	private String description;
	private Date date;
	private Date heure;
	private String lieu;
	private AgendaPerso agp;
	private List<User> liste_participants=new ArrayList<User>();
	public Evenement(String nom, String lieu, Date date, Date heure, String description) {
		this.nom = nom;
		this.lieu = lieu;
		this.date = date;
		this.heure = heure;
		this.description = description;
	}
	public Evenement() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public AgendaPerso getAgp() {
		return agp;
	}
	public void setAgp(AgendaPerso agp) {
		this.agp = agp;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getListe_participants() {
		return liste_participants;
	}
	public void setListe_participants(List<User> liste_participants) {
		this.liste_participants = liste_participants;
	}
	public void Modifier(String nom, String lieu, Date date, Date heure, String description) {
		this.nom = nom;
		this.lieu = lieu;
		this.date = date;
		this.heure = heure;
		this.description = description;
	}
	public void Supprimer() {
		
	}
	public void Inviter() {
		
	}
	public void Exclure() {
		
	}
}
