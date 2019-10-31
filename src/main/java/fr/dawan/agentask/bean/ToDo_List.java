package fr.dawan.agentask.bean;

import fe.dawan.agentask.enums.StatusTache;

public class ToDo_List {
	private String tache;
	private StatusTache statustache;
	private User user;
	public ToDo_List(String tache, StatusTache statustache) {
		super();
		this.tache = tache;
		this.statustache = StatusTache.A_Faire;
	}
	public ToDo_List() {
		super();
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	public StatusTache getStatustache() {
		return statustache;
	}
	public void setStatustache(StatusTache statustache) {
		this.statustache = statustache;
	}
	public User getIduser() {
		return user;
	}
	public void setIduser(User user) {
		this.user = user;
	}
	
}
