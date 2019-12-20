package fr.dawan.agentask.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("action")
public class Action extends elementagenda {
	
	@ManyToOne
	private AgendaPerso ap;

	public Action() {
		super();
	}

	public Action(String titre, String description, LocalDate date_debut, LocalDate date_fin, String lieu, AgendaPerso ap) {
		super(titre, description, date_debut, date_fin, lieu);
		this.ap = ap;
	}

	public AgendaPerso getAp() {
		return ap;
	}

	public void setAp(AgendaPerso ap) {
		this.ap = ap;
	}

	
}
