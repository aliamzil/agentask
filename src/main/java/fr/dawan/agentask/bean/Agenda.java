package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.List;

public abstract class Agenda {
	private int id;
	private String intitule;
	private String description;
	private List<Action> todolidt = new ArrayList<Action>();
    // --- ATRIBUTS CONFIG --- //
	private String scc_user;
	private int taille_police;
	// --- --- --- --- --- --- //
	public Agenda(int id, String intitule, String description) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.description = description;
	}
	public Agenda() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void supprimer_tache(Action tache) {
		
	}
	public void accepter_tache(Action tache,User u) {
		
	}
	public void abandoner_tache(Action tache,User u) {
		
	}
	public void valider_tache(Action tache,User u) {
		
	}
	/**
	 * Méthodes de configuration / personalisation
	 */
	public String getScc_user() {
		return scc_user;
	}
	public void setScc_user(String scc_user) {
		this.scc_user = scc_user;
	}
	public int getTaille_police() {
		return taille_police;
	}
	public void setTaille_police(int taille_police) {
		this.taille_police = taille_police;
	}
	public void personalisation(String scc_user,int taille_police) {
		setScc_user(scc_user);
		setTaille_police(taille_police);
	}
}
