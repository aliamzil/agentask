package fr.dawan.agentask.bean;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import fr.dawan.agentask.enums.Role;

@Entity
public class GroupUserRole extends DbObject{
	
	@ManyToOne
	private AgendaGroupe aggr;
	
	@ManyToOne
=======
import fr.dawan.agentask.enums.Role;

public class GroupUserRole {
	private AgendaGroupe aggr;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	private User user;
	private Role role;
	public GroupUserRole(AgendaGroupe aggr, User user, Role role) {
		this.aggr = aggr;
		this.user = user;
		this.role = role;
	}
	public GroupUserRole() {
		super();
	}
	public AgendaGroupe getAggr() {
		return aggr;
	}
	public void setAggr(AgendaGroupe aggr) {
		this.aggr = aggr;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
