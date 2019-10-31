package fr.dawan.agentask.services;

import java.util.Date;
import java.util.List;

import fr.dawan.agentask.bean.AgendaPerso;
import fr.dawan.agentask.bean.Evenement;
import fr.dawan.agentask.bean.Invitation;
import fr.dawan.agentask.bean.User;

public class ServiceEvenement {
	
	public void Modifier(Evenement e,String titre, String description, Date date_debut, Date date_fin, String lieu, AgendaPerso agp,
			List<User> liste_participants) {
		e.setTitre(titre);
		e.setDescription(description);
		e.setDate_debut(date_debut);
		e.setDate_fin(date_fin);
		e.setLieu(lieu);
		e.setAgp(agp);
		e.setListe_participants(liste_participants);
	}
	public void Supprimer() {
		
	}
	public void Inviter(Evenement e,User u,String lib, String desc) {
		Date datedujour = new Date();
		Invitation invit=new Invitation(e,e.getAgp().getUser(),u,lib,desc,datedujour,30);
		
	}
	public void Exclure() {
		
	}

}
