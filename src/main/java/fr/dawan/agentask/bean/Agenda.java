package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public abstract class Agenda extends DbObject {
=======
public abstract class Agenda {
	private int id;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	private String intitule;
	private String description;
	private List<Action> todolist = new ArrayList<Action>();
//  Dans Agenda Groupe
//	private List<Sondage> sondagelist = new ArrayList<Sondage>();
    // --- ATRIBUTS CONFIG --- //
	private String css_user;
	private int taille_police;
	// --- --- --- --- --- --- //
	public Agenda(String intitule, String description) {
		super();
		this.intitule = intitule;
		this.description = description;
	}
	public Agenda() {
		super();
	}
<<<<<<< HEAD
=======
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
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
	 * Méthodes de configuration / personalisation
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
