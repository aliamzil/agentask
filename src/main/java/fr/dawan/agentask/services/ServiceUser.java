package fr.dawan.agentask.services;

import java.security.CryptoPrimitive;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.bean.User;

public class ServiceUser extends User{
	
	public void seconnecter(String pseudo, String pass) {
		GenericDAO dao = new GenericDAO();
		CryptitudeDao crpdao = new CryptitudeDao();
	}

}
