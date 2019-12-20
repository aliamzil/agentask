package fr.dawan.agentask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.bean.Invitation;

@Service
public class ServiceInvitation {
	@Autowired
	@Qualifier("GenericDAO")
	GenericDAO dao;
	
	@Autowired
	ServiceEvenement se;
	@Autowired
	ServiceAgendaGroupe sag;

	public void accept(Invitation i) {
		if(i.getEvent()!=null) {
			se.adduser(i.getEvent(), i.getDestinataire());
		}
		if(i.getAgGroupe()!=null) {
			sag.adduser(i.getAgGroupe(), i.getDestinataire());
		}
		dao.delete(i.getClass(), i.getId());
	}
	public void reffuse(Invitation i) {
		dao.delete(i.getClass(), i.getId());
	}
}
