package fr.dawan.agentask.DAO;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CryptitudeDao {
	
		public int pgcd(int r,int phin) {
			// PDCD entre r et phin			
	        while (r != phin) {
	            if (r > phin) {r = r - phin;}
	            else {phin = phin - r;}
	        }
			return r;
		}
	
		public String clepublic(int p, int q) {
			String maCle = "Clé publique";
			
			int n = p*q;
			int phin = (p-1)*(q-1);
			int o = (p>q)?p:q;
			int pgcd1 = 1000000;
			
			for(int i=o;i<=phin;i++){
				pgcd1 = pgcd(i,phin);
				if(pgcd1==1) break;
			}
			
			
			return maCle;
		}

//	Crypter le mot de passe :

		public String encrypt(String password,String key){
		try
		{
		Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.ENCRYPT_MODE,clef);
		return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
		{
		return null;
		}
		}

		 
//		Décrypter le mot de passe :

		public String decrypt(String password,String key){
		try
		{
		Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.DECRYPT_MODE,clef);
		return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
		{
		System.out.println(e);
		return null;
		}
		}

}
