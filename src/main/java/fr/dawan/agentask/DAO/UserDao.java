package fr.dawan.agentask.DAO;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.agentask.bean.User;


public class UserDao extends GenericDAO{

	@PersistenceContext
	private EntityManager em;
	
//	private EntityManagerFactory  emf = Persistence.createEntityManagerFactory("agentask"); 
//	private EntityManager em = emf.createEntityManager();
	
	public User chercheruser(String pseudo) {

		Query query=em.createQuery("SELECT user FROM User user WHERE user.pseudo = ?1");
		query.setParameter(1, pseudo);
		
		List<User> result=query.getResultList();
		if(result.isEmpty()) {return null;}
		else {return result.get(0);}
	}
	
	public User chercheruseremail(String email) {

		Query query=em.createQuery("SELECT user FROM User user WHERE user.email = ?1");
		query.setParameter(1, email);
		
		List<User> result=query.getResultList();
		if(result.isEmpty()) {return null;}
		else {return result.get(0);}
	}
=======
public class UserDao extends GenericDAO{
	
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

}
