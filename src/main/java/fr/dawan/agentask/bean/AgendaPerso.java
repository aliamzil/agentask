package fr.dawan.agentask.bean;

public class AgendaPerso extends Agenda {
	private User user;
	
	public AgendaPerso(int id, String intitule, String description, User user) {
		super(id, intitule, description);
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
