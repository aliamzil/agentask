package fr.dawan.agentask.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.Action;
import fr.dawan.agentask.bean.AgendaPerso;
import fr.dawan.agentask.bean.elementagenda;

@Service
public class ServiceAction extends ServiceElementAgenda {
	
	@Autowired
	UserDao udao;
	
	@Autowired
	@Qualifier("GenericDAO")
	GenericDAO dao;
	
	public void creer(String titre, String description, LocalDate date_debut, LocalDate date_fin, String lieu, AgendaPerso ap) {
		Action a1 = new Action(titre, description, date_debut,date_fin, lieu, ap);
		udao.create(a1);
	}
	public void supprimer(int id) {
		dao.delete(Action.class, id);
	}
	public void modifier(Action a, String titre, String description, LocalDate date_debut, LocalDate date_fin, String lieu) {
		a.setTitre(titre);
		a.setDescription(description);
		a.setDate_debut(date_debut);
		a.setDate_fin(date_fin);
		a.setLieu(lieu);
		dao.update(a);
	}
	public Action visualisation(int id) {
		Action a = dao.findById(Action.class, id);
		return a;
	}

}
