package fr.dawan.agentask.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
 
=======

>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
@Entity
public class User extends DbObject {

	@Column(length = 50)
	private String pseudo;

	@Column(length = 50)
	private String email;

	@Column(length = 50)
	private String pass;
	
	private LocalDate date;
	
	/**
	 * @param pseudo
	 * @param email
	 * @param pass
	 * @param date
<<<<<<< HEAD
	 * 
=======
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	 */
	
	public User(String pseudo, String email, String pass, LocalDate date) {
		this.pseudo = pseudo;
		this.email = email;
		this.pass = pass;
		this.date = date;
	}
	public User() {
		super();
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
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}