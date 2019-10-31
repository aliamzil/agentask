package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.List;

import fe.dawan.agentask.enums.Status;
import fe.dawan.agentask.enums.TypeGroupe;

public class Groupe {
	private String name;
	private Status status;
	private TypeGroupe type;
	private User admin;
	private List<User> lstusr=new ArrayList<User>();// TODO hashmap <user, alias>
	public Groupe(String name, Status status, TypeGroupe type, User admin) {
		super();
		this.name = name;
		this.status = status;
		this.type = type;
		this.admin = admin;
	}
	public Groupe() {
		super();
	}
	
	public void inviter(User e) {
		this.lstusr.add(e);
	}
	public void exclure(User u,List<User> l) {
		l.remove(l.indexOf(u));
	}
}
