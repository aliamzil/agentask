package fr.dawan.agentask.bean;

<<<<<<< HEAD
import javax.persistence.Entity;

@Entity
public class Carnet_Contact extends DbObject {
=======
public class Carnet_Contact {
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	private String nom;
	private String prenom;
	private String adressemail;
	public Carnet_Contact(String nom, String prenom, String adressemail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressemail = adressemail;
	}
	public Carnet_Contact() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdressemail() {
		return adressemail;
	}
	public void setAdressemail(String adressemail) {
		this.adressemail = adressemail;
	}
	
}