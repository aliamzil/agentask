package fr.dawan.agentask.bean;

import java.util.Date;

import fr.dawan.agentask.enums.Role;

public class User {
	private int id;
	private String pseudo;
	private String email;
	private String pass;
	private Date date;
	
	public User(int id, String pseudo, String email, String pass, Date date) {
		this.id = id;
		this.pseudo = pseudo;
		this.email = email;
		this.pass = pass;
		this.date = date;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
