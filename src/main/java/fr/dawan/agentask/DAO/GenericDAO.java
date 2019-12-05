package fr.dawan.agentask.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.dawan.agentask.bean.DbObject;

public class GenericDAO {

	public static <T extends DbObject> void create(T entity) {
		if (entity != null && entity.getId() == 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();

			try {
				// d�but de la transaction
				transaction.begin();

				// On ins�re la formation dans la BDD
				entityManager.persist(entity);

				// on commit tout ce qui s'est fait dans la transaction
				transaction.commit();
			} catch (Exception ex) {
				// en cas d'erreur, on effectue un rollback
				transaction.rollback();
				ex.printStackTrace();
			} finally {
				entityManager.close();
			}
		}
	}

	public static <T extends DbObject> T findById(Class<T> clazz, long id) {

		EntityManager entityManager = createEntityManager();
		T entity = null;

		try {
			// On charge la formation depuis la BDD, selon son ID
			entity = entityManager.find(clazz, id);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			entityManager.close();
		}

		return entity;
	}

	public static <T extends DbObject> void update(T entity) {
		if (entity.getId() > 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();

			try {
				// d�but de la transaction
				transaction.begin();

				// On met � jour la formation
				entityManager.merge(entity);

				// on commit tout ce qui s'est fait dans la transaction
				transaction.commit();
			} catch (Exception ex) {
				// en cas d'erreur, on effectue un rollback
				transaction.rollback();
				ex.printStackTrace();
			} finally {
				entityManager.close();
			}
		}
	}

	public static <T extends DbObject> void delete(Class<T> clazz, long id) {
		EntityManager entityManager = createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			// d�but de la transaction
			transaction.begin();

			T entity = entityManager.find(clazz, id);
			entityManager.remove(entity);

			// on commit tout ce qui s'est fait dans la transaction
			transaction.commit();
		} catch (Exception ex) {
			// en cas d'erreur, on effectue un rollback
			transaction.rollback();
			ex.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	public static <T extends DbObject> List<T> findAll(Class<T> clazz) {
		List<T> resultat = null;

		EntityManager em = createEntityManager();

		// on cr�e la requ�te
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on ex�cute la requ�te et on r�cup�re le r�sultat
		resultat = query.getResultList();

		em.close();

		return resultat;
	}

	/**
	 * Permet de r�cup�rer toutes les entr�es pour une table donn�es � partir d'une
	 * entr�e, pour un nombre de r�sultat donn�
	 * 
	 * @param clazz    : le type que l'on souhaite r�cup�rer
	 * @param begin    : l'index du premier r�sultat
	 * @param nbResult : le nombre de r�sultat que l'on souhaite r�cup�rer
	 * @return une liste d'entr�es pagin�e
	 */
	public static <T extends DbObject> List<T> findAll(Class<T> clazz, int begin, int nbResult) {
		List<T> resultat = null;

		EntityManager em = createEntityManager();

		// on cr�e la requ�te
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on param�tre et on ex�cute la requ�te, et on r�cup�re le r�sultat
		resultat = query.setFirstResult(begin) // On commence � ce num�ro (begin) - au Ni�me r�sultat
				.setMaxResults(nbResult) // on charge nbResult r�sultats
				.getResultList();

		em.close();

		return resultat;
	}

	public static <T extends DbObject> void deleteAll(Class<T> clazz) {

		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Query query = em.createQuery("Delete FROM " + clazz.getName());
		query.executeUpdate();
		
		transaction.commit();
		em.close();
	}

	public static EntityManager createEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agentask");
		EntityManager entityManager = factory.createEntityManager();
		return entityManager;
	}
}
