package fr.dawan.agentask.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.dawan.agentask.bean.User;

public class UserDao extends GenericDAO{
	@PersistenceContext
	private EntityManager em;

	public User findByPseudo(String pseudo) {

		EntityManager entityManager = createEntityManager();
		User entity = null;

		try {
			// On charge la formation depuis la BDD, selon son ID
			entity = entityManager.find(User.class, pseudo);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			entityManager.close();
		}

		return entity;
	}
	
	public User chercheruser(String pseudo, boolean closeConnection) {
		System.out.println("chercher user");
//		Query query=em.createQuery("SELECT user FROM User user WHERE user.pseudo = :pseudo");
//		System.out.println("test");		
//		query.setParameter("pseudo", pseudo);
		

		Query query=em.createQuery("SELECT user FROM User user WHERE user.pseudo = '"+pseudo+"'");
		
		System.out.println("liste");
		
		List<User> result=query.getResultList();
		User u1 = result.get(0);
		
		System.out.println(u1.getPseudo());
		
		if(closeConnection) {
			em.close();
		}
		return u1;
	}

}
