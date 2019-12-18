package fr.dawan.agentask;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;

import fr.dawan.agentask.DAO.GenericDAO;
import fr.dawan.agentask.bean.User;

public class UserTest {

	private final String PSEUDO = "test";
	private final String MAIL = "test@mail.com";
	private final String PASS = "plop";
	private final LocalDate DATE= LocalDate.now();
	
	@Autowired
	GenericDAO dao;
	
	User u=null,u2=null,u3=null;
	
			
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		dao.delete(u.getClass(), u.getId());
	}

	@Test
	public void testCreateUser() {
		String pseu="",mail="",pass="";
		LocalDate ladate = LocalDate.now();
		
		u = new User(PSEUDO,MAIL,PASS,DATE);
		
		dao.create(u);

		assertEquals(PSEUDO,u.getPseudo());
		assertEquals(MAIL,u.getEmail());
		assertEquals(PASS,u.getPass());
		assertEquals(DATE,u.getDate());
		
		u2 = new User();
		
		u2.setPseudo(PSEUDO);
		u2.setEmail(MAIL);
		u2.setPass(PASS);
		u2.setDate(DATE);

		dao.create(u2);
		dao.create(u3); 
		
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
