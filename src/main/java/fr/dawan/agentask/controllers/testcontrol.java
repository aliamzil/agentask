package fr.dawan.agentask.controllers;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.dawan.agentask.DAO.CryptitudeDao;
import fr.dawan.agentask.DAO.UserDao;
import fr.dawan.agentask.bean.User;
import fr.dawan.agentask.services.ServiceUser;

@Controller
public class testcontrol {
	
	@Autowired
	UserDao ud;
	
	@Autowired
	ServiceUser su;
	
	
	@GetMapping("/testuser404")
	public String testuser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String res = "home";
		
		User u1 = null;
		String co = su.connect(u1,"Test", "pass123456", session);
		if(session.getAttribute("user")!=null) {
			u1 = (User) session.getAttribute("user");
			System.out.println(u1.getPseudo());
		}
		
//		su.sendmailuser("thekom.7835@gmail.com", "test mail", "Mail de test pour java");
		
		return res;
	}

}
