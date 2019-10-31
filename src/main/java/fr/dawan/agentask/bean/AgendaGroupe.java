package fr.dawan.agentask.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fe.dawan.agentask.enums.Role;

public class AgendaGroupe extends Agenda {
	private int idAgendaGroupe;
	private String titre;
	private HashMap<User, Role> lstu=new HashMap<User, Role>();
	private List<Sondage> lstsnd = new ArrayList<Sondage>();
	

	public void inviter(User e,Role r) {
		// TODO envoyer une invitation.
		// TODO this.lstu.put(e, r); Integration aprés acceptation user
	}
	public void exclure(User u,HashMap<User, Role> l) {
		l.remove(u);
	}
}
