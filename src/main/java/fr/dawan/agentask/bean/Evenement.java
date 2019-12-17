package fr.dawan.agentask.bean;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evenement extends DbObject {
	private int idevent;
	private String titre;
	private String description;
	private Date date_debut;
	private Date date_fin;
	private String lieu;
	
	@ManyToOne
	private AgendaPerso agp;
	
	@OneToMany
	private List<User> liste_participants=new ArrayList<User>();

	public Evenement(String titre, String description, Date date_debut, Date date_fin, String lieu, AgendaPerso agp,
			List<User> liste_participants) {
		this.titre = titre;
		this.description = description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.lieu = lieu;
		this.agp = agp;
		this.liste_participants = liste_participants;
	}
	
	public Evenement() {
		super();
	}
	
	public int getIdevent() {
		return idevent;
	}

	public void setIdevent(int idevent) {
		this.idevent = idevent;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public AgendaPerso getAgp() {
		return agp;
	}

	public void setAgp(AgendaPerso agp) {
		this.agp = agp;
	}

	public List<User> getListe_participants() {
		return liste_participants;
	}

	public void setListe_participants(List<User> liste_participants) {
		this.liste_participants = liste_participants;
	}

}
