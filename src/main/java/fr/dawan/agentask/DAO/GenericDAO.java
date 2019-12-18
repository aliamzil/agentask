package fr.dawan.agentask.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
<<<<<<< HEAD
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import fr.dawan.agentask.bean.DbObject;

@Transactional
public class GenericDAO {

	@PersistenceContext
	private EntityManager em;
	
//	private EntityManagerFactory  emf = Persistence.createEntityManagerFactory("agentask"); 
//	private EntityManager em = emf.createEntityManager();
	
	public <T extends DbObject> void create(T entity) {

		em.persist(entity);
		
//		if (entity != null && entity.getId() == 0) {
//			EntityManager entityManager = createEntityManager();
//			EntityTransaction transaction = entityManager.getTransaction();
//
//			try {
//				// début de la transaction
//				transaction.begin();
//
//				// On insère la formation dans la BDD
//				entityManager.persist(entity);
//
//				// on commit tout ce qui s'est fait dans la transaction
//				transaction.commit();
//			} catch (Exception ex) {
//				// en cas d'erreur, on effectue un rollback
//				transaction.rollback();
//				ex.printStackTrace();
//			} finally {
//				entityManager.close();
//			}
//		}
	}

	public <T extends DbObject> T findById(Class<T> clazz, long id) {
		
		return em.find(clazz, id);

//		EntityManager entityManager = createEntityManager();
//		T entity = null;
//
//		try {
//			// On charge la formation depuis la BDD, selon son ID
//			entity = entityManager.find(clazz, id);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			entityManager.close();
//		}
//
//		return entity;
	}

	public <T extends DbObject> void update(T entity) {
		if (entity.getId() > 0) {
			em.merge(entity);
		}
//			EntityManager entityManager = createEntityManager();
//			EntityTransaction transaction = entityManager.getTransaction();
//
//			try {
//				// début de la transaction
//				transaction.begin();
//
//				// On met à jour la formation
//				entityManager.merge(entity);
//
//				// on commit tout ce qui s'est fait dans la transaction
//				transaction.commit();
//			} catch (Exception ex) {
//				// en cas d'erreur, on effectue un rollback
//				transaction.rollback();
//				ex.printStackTrace();
//			} finally {
//				entityManager.close();
//			}
//		}
	}

	public <T extends DbObject> void delete(Class<T> clazz, long id) {
		T entity = em.find(clazz, id);
		em.remove(entity);
		
//		EntityManager entityManager = createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//
//		try {
//			// début de la transaction
//			transaction.begin();
//
//			T entity = entityManager.find(clazz, id);
//			entityManager.remove(entity);
//
//			// on commit tout ce qui s'est fait dans la transaction
//			transaction.commit();
//		} catch (Exception ex) {
//			// en cas d'erreur, on effectue un rollback
//			transaction.rollback();
//			ex.printStackTrace();
//		} finally {
//			entityManager.close();
//		}
	}

	public <T extends DbObject> List<T> findAll(Class<T> clazz) {
		List<T> resultat = null;

//		EntityManager em = createEntityManager();
=======
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.dawan.agentask.bean.DbObject;

public class GenericDAO {

	public static <T extends DbObject> void create(T entity) {
		if (entity != null && entity.getId() == 0) {
			EntityManager entityManager = createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();

			try {
				// début de la transaction
				transaction.begin();

				// On insère la formation dans la BDD
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
				// début de la transaction
				transaction.begin();

				// On met à jour la formation
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
			// début de la transaction
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
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

		// on crée la requête
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on exécute la requête et on récupère le résultat
		resultat = query.getResultList();

<<<<<<< HEAD
//		em.close();
=======
		em.close();
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

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
<<<<<<< HEAD
	public <T extends DbObject> List<T> findAll(Class<T> clazz, int begin, int nbResult) {
		List<T> resultat = null;

//		EntityManager em = createEntityManager();
=======
	public static <T extends DbObject> List<T> findAll(Class<T> clazz, int begin, int nbResult) {
		List<T> resultat = null;

		EntityManager em = createEntityManager();
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

		// on crée la requête
		TypedQuery<T> query = em.createQuery("SELECT entity FROM " + clazz.getName() + " entity", clazz);

		// on paramètre et on exécute la requête, et on récupère le résultat
		resultat = query.setFirstResult(begin) // On commence à ce numéro (begin) - au Nième résultat
				.setMaxResults(nbResult) // on charge nbResult résultats
				.getResultList();

<<<<<<< HEAD
//		em.close();
=======
		em.close();
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

		return resultat;
	}

<<<<<<< HEAD
	public <T extends DbObject> void deleteAll(Class<T> clazz) {

//		EntityManager em = createEntityManager();
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
=======
	public static <T extends DbObject> void deleteAll(Class<T> clazz) {

		EntityManager em = createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
		
		Query query = em.createQuery("Delete FROM " + clazz.getName());
		query.executeUpdate();
		
<<<<<<< HEAD
//		transaction.commit();
//		em.close();
	}

//	public static EntityManager createEntityManager() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agentask");
//		EntityManager entityManager = factory.createEntityManager();
//		return entityManager;
//	}
=======
		transaction.commit();
		em.close();
	}

	public static EntityManager createEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("agentask");
		EntityManager entityManager = factory.createEntityManager();
		return entityManager;
	}
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
}
