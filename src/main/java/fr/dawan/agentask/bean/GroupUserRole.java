package fr.dawan.agentask.bean;

import fe.dawan.agentask.enums.Role;

public class GroupUserRole {
	private AgendaGroupe aggr;
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
