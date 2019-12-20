package fr.dawan.agentask.services;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.bean.AgendaGroupe;
import fr.dawan.agentask.bean.Invitation;
import fr.dawan.agentask.bean.Sondage;
import fr.dawan.agentask.bean.User;
import fr.dawan.agentask.enums.Role;

@Service
public class ServiceAgendaGroupe extends ServiceAgenda {
	
	@Autowired
	@Qualifier("GenericDAO")
	GenericDAO dao;
	
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
		agGr.getLstsnd().remove(agGr.getLstsnd().indexOf(sondage));
	}
	
	public void adduser(AgendaGroupe ag, User u) {
		HashMap<User, Role> lu = ag.getLstu();
		lu.put(u, Role.Visiteur);
		ag.setLstu(lu);
		dao.update(ag);
	}
}
