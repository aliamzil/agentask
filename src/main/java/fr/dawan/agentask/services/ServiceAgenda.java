package fr.dawan.agentask.services;

import fr.dawan.agentask.bean.Action;
import fr.dawan.agentask.bean.Agenda;
import fr.dawan.agentask.bean.User;

public class ServiceAgenda {
	public void supprimer_tache(Action tache) {
		
	}
	public void accepter_tache(Action tache,User u) {
		
	}
	public void abandoner_tache(Action tache,User u) {
		
	}
	public void valider_tache(Action tache,User u) {
		
	}
	/**
	 * Méthodes de configuration / personalisation
	 */
	public void personalisation(Agenda ag, String scc_user,int taille_police) {
		ag.setCss_user(scc_user);
		ag.setTaille_police(taille_police);
	}
}
