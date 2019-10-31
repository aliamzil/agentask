package fr.dawan.agentask.bean;

public class Carnet_Contact {
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