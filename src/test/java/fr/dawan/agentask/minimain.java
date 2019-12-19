package fr.dawan.agentask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.User;

public class minimain {
	
	@Autowired
	static UserDao ud;

	public static void main(String[] args) {
		// Calsse pour les tests de code
		System.out.println("TESTS");
		
		CryptitudeDao c1 = new CryptitudeDao();
		System.out.println(c1.cryptage("totopass"));
		
//		UserDao ud = new UserDao();
		System.out.println(ud);
		
		
		try {
			User u1 = ud.chercheruser("Toto1");
			System.out.println(u1.getPseudo() + " : " + u1.toString());
		} catch (Exception e) {
			
			System.out.println("AAAaaarg !!!");
			e.printStackTrace();
		}
		
		
	 	
		
	}

}
