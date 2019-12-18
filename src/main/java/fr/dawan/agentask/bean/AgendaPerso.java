package fr.dawan.agentask.bean;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class AgendaPerso extends Agenda {
	
	@OneToOne
	private User user;
	
	public AgendaPerso(String intitule, String description, User user) {
		super(intitule, description);
		// TODO Auto-generated constructor stub
	}
	
	public AgendaPerso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
