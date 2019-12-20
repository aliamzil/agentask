package fr.dawan.agentask.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.Action;
import fr.dawan.agentask.bean.AgendaPerso;
import fr.dawan.agentask.bean.Evenement;
import fr.dawan.agentask.bean.Invitation;
import fr.dawan.agentask.bean.User;

@Service
public class ServiceEvenement extends ServiceElementAgenda {

	@Autowired
	@Qualifier("GenericDAO")
	GenericDAO dao;
	@Autowired
	UserDao udao;
	
	public void creer(String titre, String description, LocalDate date_debut, LocalDate date_fin, String lieu, AgendaPerso ap) {
		Evenement e1 = new Evenement(titre, description, date_debut,date_fin, lieu, ap);
		udao.create(e1);
	}
	public void supprimer(int id) {
		dao.delete(Evenement.class, id);
	}
	public void Inviter(Evenement e,User u,String lib, String desc) {
		Date datedujour = new Date();
		Invitation invit=new Invitation(e,e.getAp().getUser(),u,lib,desc,datedujour,30);
	}
	public void adduser(Evenement e, User u) {
		List<User> lu = e.getListe_participants();
		lu.add(u);
		e.setListe_participants(lu);
		dao.update(e);
	}
	public void Exclure(Evenement e, User u) {
		List<User> lu = e.getListe_participants();
		lu.remove(lu.indexOf(u));
		e.setListe_participants(lu);
		dao.update(e);
	}

}
