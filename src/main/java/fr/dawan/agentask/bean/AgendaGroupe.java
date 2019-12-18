package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import fr.dawan.agentask.enums.Role;


@Entity
public class AgendaGroupe extends Agenda {
	private int idAgendaGroupe;
	private String titre;
	
	
	private HashMap<User, Role> lstu = new HashMap<User, Role>();
	
	@OneToMany
=======
import fr.dawan.agentask.enums.Role;

public class AgendaGroupe extends Agenda {
	private int idAgendaGroupe;
	private String titre;
	private HashMap<User, Role> lstu=new HashMap<User, Role>();
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	private List<Sondage> lstsnd = new ArrayList<Sondage>();

	public AgendaGroupe(int idAgendaGroupe, String titre) {
		super();
		this.idAgendaGroupe = idAgendaGroupe;
		this.titre = titre;
	}
<<<<<<< HEAD

	public AgendaGroupe() {
		super();
	}

	public int getIdAgendaGroupe() {
		return idAgendaGroupe;
	}

	public void setIdAgendaGroupe(int idAgendaGroupe) {
		this.idAgendaGroupe = idAgendaGroupe;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public HashMap<User, Role> getLstu() {
		return lstu;
	}

	public void setLstu(HashMap<User, Role> lstu) {
		this.lstu = lstu;
	}

	public List<Sondage> getLstsnd() {
		return lstsnd;
	}

=======
	
	public AgendaGroupe() {
		super();
	}
	
	public int getIdAgendaGroupe() {
		return idAgendaGroupe;
	}
	
	public void setIdAgendaGroupe(int idAgendaGroupe) {
		this.idAgendaGroupe = idAgendaGroupe;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public HashMap<User, Role> getLstu() {
		return lstu;
	}
	
	public void setLstu(HashMap<User, Role> lstu) {
		this.lstu = lstu;
	}
	
	public List<Sondage> getLstsnd() {
		return lstsnd;
	}
	
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	public void setLstsnd(List<Sondage> lstsnd) {
		this.lstsnd = lstsnd;
	}
}
