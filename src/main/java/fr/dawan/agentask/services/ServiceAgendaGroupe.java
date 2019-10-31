package fr.dawan.agentask.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import fr.dawan.agentask.bean.AgendaGroupe;
import fr.dawan.agentask.bean.Invitation;
import fr.dawan.agentask.bean.Sondage;
import fr.dawan.agentask.bean.User;
import fr.dawan.agentask.enums.Role;

public class ServiceAgendaGroupe extends ServiceAgenda {
	
	// Méthodes de gestion des utilisateurs membres du groupe (agenda groupe)
	public void inviter(AgendaGroupe agGr,User exp,User u,String lib, String desc) {
		// [x] envoyer une invitation.
		Date datedujour = new Date();
		Invitation invit=new Invitation(agGr,exp,u,lib,desc,datedujour,30);
		// TODO this.lstu.put(e, r); Integration aprés acceptation user
	}
	public void exclure(User u,HashMap<User, Role> l) {
		l.remove(u);
	}
	// Méthodes de gestion des sondages
	public void supprimer_sondage(AgendaGroupe agGr,Sondage sondage) {
		agGr.getSondagelist().remove(agGr.getSondagelist().indexOf(sondage));
	}
}
