package fr.dawan.agentask.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import fr.dawan.agentask.bean.DbObject;

@Transactional
public class GenericDAO {

	@PersistenceContext
	private EntityManager em;
	
	public <T extends DbObject> void create(T entity) {
		em.persist(entity);
	}

	public <T extends DbObject> T findById(Class<T> clazz, long id) {
		return em.find(clazz, id);
	}

	public <T extends DbObject> void update(T entity) {
		if (entity.getId() > 0) {
			em.merge(entity);
		}
	}

	public <T extends DbObject> void delete(Class<T> clazz, long id) {
		T entity = em.find(clazz, id);
		em.remove(entity);
	}

	public <T extends DbObject> List<T> findAll(Class<T> clazz) {
		List<T> resultat = null;
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);
		resultat = query.getResultList();
		return resultat;
	}

	/**
	 * Permet de récupérer toutes les entrées pour une table données à partir d'une
	 * entrée, pour un nombre de résultat donné
	 * 
	 * @param clazz    : le type que l'on souhaite récupérer
	 * @param begin    : l'index du premier résultat
	 * @param nbResult : le nombre de résultat que l'on souhaite récupérer
	 * @return une liste d'entrées paginée
	 */
	public <T extends DbObject> List<T> findAll(Class<T> clazz, int begin, int nbResult) {
		List<T> resultat = null;

		// on crée la requête
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on paramètre et on exécute la requête, et on récupère le résultat
		resultat = query.setFirstResult(begin) // On commence à ce numéro (begin) - au Nième résultat
				.setMaxResults(nbResult) // on charge nbResult résultats
				.getResultList();

		return resultat;
	}

	public <T extends DbObject> void deleteAll(Class<T> clazz) {
		Query query = em.createQuery("Delete FROM " + clazz.getName());
		query.executeUpdate();
	}
	
	public <T extends DbObject> long countElementby(Class<T> clazz,String att,String vallatt) throws Exception {
		TypedQuery<Long> query=em.createQuery("SELECT COUNT(entity) FROM "+clazz.getName()+" entity WHERE entity."+att+"='"+vallatt+"'", Long.class);
		long result=query.getSingleResult();
		return result;
	}
	
}
