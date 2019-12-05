package fr.dawan.agentask;

import fr.dawan.agentask.DAO.CryptitudeDao;

public class minimain {

	public static void main(String[] args) {
		
		CryptitudeDao crpdao = new CryptitudeDao();
		
		String pass = "ChArABia45!";

		System.out.println(crpdao.cryptage(pass));
	}

}
