package fr.dawan.agentask.services;

import java.util.HashMap;

import javax.servlet.http.Cookie;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.User;

public class ServiceUser extends User{
	
	public int seconnecter(String pseudo, String pass) {
		int res = 0; //0 = Default ; 1 = Pseudo incorect ; 2 = Mot de passe incorect ; 3 = OK
		
		CryptitudeDao crpdao = new CryptitudeDao();	
		UserDao udao = new UserDao();
		
		try {
			User u1 = udao.findByPseudo(pseudo);
			String crpass = crpdao.cryptage(pass);
			
			if(crpass != u1.getPass()) {
				res = 2;
			} else {
				res = 3;
			}
		} catch (Exception e) {
			res = 1;
		}
		
		return res;
	}

	public String connect(String pseudo, String pass) {
		UserDao udao = new UserDao();
		int res01 = this.seconnecter(pseudo, pass);
		User u1;
		
		switch (res01) {
			case 1:
				return "Pseudo incorect";
			case 2:
				return "Mot de passe incorect";
			case 3:
				u1 = udao.findByPseudo(pseudo);
				String idu = ""+u1.getId();
				Cookie c01 = new Cookie("id", idu);
				Cookie c02 = new Cookie("pseudo", u1.getPseudo());
				return "ok";
			default:
				return "Erreur inconue";
		}
	}

}
