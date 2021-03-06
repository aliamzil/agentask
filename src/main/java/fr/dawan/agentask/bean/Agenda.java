package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.List;

public abstract class Agenda {
	private int id;
	private String intitule;
	private String description;
	private List<Action> todolist = new ArrayList<Action>();
//  Dans Agenda Groupe
//	private List<Sondage> sondagelist = new ArrayList<Sondage>();
    // --- ATRIBUTS CONFIG --- //
	private String css_user;
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
	public List<Action> getTodolist() {
		return todolist;
	}
	public void setTodolist(List<Action> todolidt) {
		this.todolist = todolidt;
	}
//  Dans Agenda Groupe
//	public List<Sondage> getSondagelist() {
//		return sondagelist;
//	}
//	public void setSondagelist(List<Sondage> sondagelist) {
//		this.sondagelist = sondagelist;
//	}
	/**
	 * M�thodes de configuration / personalisation
	 */
	public String getCss_user() {
		return css_user;
	}
	public void setCss_user(String css_user) {
		this.css_user = css_user;
	}
	public int getTaille_police() {
		return taille_police;
	}
	public void setTaille_police(int taille_police) {
		this.taille_police = taille_police;
	}
}
