package fr.dawan.agentask;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.bean.User;

public class UserTest {

<<<<<<< HEAD
	private final String PSEUDO = "test";
	private final String MAIL = "test@mail.com";
	private final String PASS = "plop";
	private final LocalDate DATE= LocalDate.now();
	
	@Autowired
	GenericDAO dao;
	
	User u=null,u2=null,u3=null;
	
			
=======
	private final String PSEUDO = "Toto";
	private final String MAIL = "toto@mail.com";
	private final String PASS = "pass";
	private final LocalDate DATE= LocalDate.now();

>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
<<<<<<< HEAD
		dao.delete(u.getClass(), u.getId());
=======
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	}

	@Test
	public void testCreateUser() {
		String pseu="",mail="",pass="";
		LocalDate ladate = LocalDate.now();
		
<<<<<<< HEAD
		u = new User(PSEUDO,MAIL,PASS,DATE);
=======
		GenericDAO dao = new GenericDAO();
		User u = new User(PSEUDO,MAIL,PASS,DATE);
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
		
		dao.create(u);

		assertEquals(PSEUDO,u.getPseudo());
		assertEquals(MAIL,u.getEmail());
		assertEquals(PASS,u.getPass());
		assertEquals(DATE,u.getDate());
		
<<<<<<< HEAD
		u2 = new User();
=======
		User u2 = new User();
		User u3 = null;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
		
		u2.setPseudo(PSEUDO);
		u2.setEmail(MAIL);
		u2.setPass(PASS);
		u2.setDate(DATE);

<<<<<<< HEAD
		dao.create(u2);
		dao.create(u3); 
=======
		GenericDAO.create(u2);
		GenericDAO.create(u3); 
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
		
		pseu = u2.getPseudo();
		mail = u2.getEmail();
		pass = u2.getPass();
		ladate = u2.getDate();

		assertEquals(pseu,u.getPseudo());
		assertEquals(mail,u.getEmail());
		assertEquals(pass,u.getPass());
		assertEquals(ladate,u.getDate());
		
		
	}

}
