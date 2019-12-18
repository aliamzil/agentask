package fr.dawan.agentask.bean;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class AgendaPerso extends Agenda {
	
	@OneToOne
=======
public class AgendaPerso extends Agenda {
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
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
