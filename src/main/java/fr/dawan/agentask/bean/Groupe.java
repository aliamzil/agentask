// /!\ CLASSE OBSOLETE !
package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.agentask.enums.Status;
import fr.dawan.agentask.enums.TypeGroupe;

public class Groupe {
	private String name;
	private Status status;
	private TypeGroupe type;
	private User admin;
	private List<User> lstusr=new ArrayList<User>();// TODO hashmap <user, alias>
	public Groupe(String name, Status status, TypeGroupe type, User admin) {
		super();
		this.setName(name);
		this.setStatus(status);
		this.setType(type);
		this.setAdmin(admin);
	}
	public Groupe() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public TypeGroupe getType() {
		return type;
	}
	public void setType(TypeGroupe type) {
		this.type = type;
	}
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public void inviter(User e) {
		this.lstusr.add(e);
	}
	public void exclure(User u,List<User> l) {
		l.remove(l.indexOf(u));
	}
}
