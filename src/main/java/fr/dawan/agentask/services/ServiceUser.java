package fr.dawan.agentask.services;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.User;

@Service
public class ServiceUser {
	
	@Autowired
	UserDao udao;
	@Autowired
	CryptitudeDao crpdao;
    @Autowired

	
	public Session s01;
	
	public String createuser(String pseudo, String mail, String pass, String repass, LocalDate ddn) {
		
		System.out.println(pass + " - " + repass);
		
		User uu = null;
		uu = udao.chercheruser(pseudo);
		
		System.out.println("test 0");
		if(uu != null) {
			return "Pseudo déja utilisé";
		}
		
		User uu2 = null;
		uu2 = udao.chercheruseremail(mail);
		
		System.out.println("test 0");
		if(uu2 != null) {
			return "Email déja utilisé";
		}

		if(pass.equals(repass)) {
			User u = new User(pseudo, mail, crpdao.cryptage(pass), ddn);		
			udao.create(u);
			return "ok";
		} else {
			return "Le mot de passe de confirmation n'est pas identique au premier !";
		}
	}
	
	public int seconnecter(String pseudo, String pass) {
		int res = 0; //0 = Default ; 1 = Pseudo incorect ; 2 = Mot de passe incorect ; 3 = OK
		User u1;
		
		try {
			u1 = udao.chercheruser(pseudo);
			String crpass = crpdao.cryptage(pass);
			String u1pass = u1.getPass();
			
			if(!crpass.equals(u1pass)) {
				res = 2;
			} else {
				res = 3;
			}
		} catch (Exception e) {
			res = 1;
		}
		
		return res;
	}
	
	public String connect(User u1, String pseudo, String pass,HttpSession session) {

		int res01 = this.seconnecter(pseudo, pass);
		 
		switch (res01) {
			case 1:
				return "Pseudo incorect";
			case 2:
				return "Mot de passe incorect";
			case 3:
				u1 = udao.chercheruser(pseudo);
				session.setAttribute("user", u1);
				return "ok";
			default:
				return "Erreur inconue";
		}
	}
	
	public void deconnect(HttpSession session) {
		session.invalidate();
	}
	
	public void sendmailuser(String to, String subject, String text) {

	}
}
