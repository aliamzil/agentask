package fr.dawan.agentask;

import java.util.List;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.User;

public class minimain {

	public static void main(String[] args) {
		// Calsse pour les tests de code
		System.out.println("TESTS");
		
		CryptitudeDao c1 = new CryptitudeDao();
		System.out.println(c1.cryptage("totopass"));
		
		UserDao ud = new UserDao();
		System.out.println(ud);
		
		
		try {
			User u1 = ud.chercheruser("Toto1",false);
			System.out.println(u1.getPseudo() + " : " + u1.toString());
		} catch (Exception e) {
			
			System.out.println("AAAaaarg !!!");
			e.printStackTrace();
		}
		
		
		
		
	}

}
