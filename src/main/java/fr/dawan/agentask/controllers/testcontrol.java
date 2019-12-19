package fr.dawan.agentask.controllers;

import java.time.LocalDate;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
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
    @Autowired
    private JavaMailSender emailSender;
    @Autowired
    CryptitudeDao cd;
	
	@GetMapping("/testuser404")
	public String testuser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String res = "home";
		
		User u1 = null;
		String co = su.connect(u1,"Roger2", "rogerpass", session);
		if(session.getAttribute("user")!=null) {
			u1 = (User) session.getAttribute("user");
			System.out.println(u1.getPseudo());
		}
		
		su.passperdu(u1);
		
		su.createuser("Roberto", "rbt@mail.com", "blabla", "blabla", LocalDate.now());
		
		return res;
	}

	@GetMapping("/testmailhtml")
	public String testMailhtml() {
		su.envoimail("test@mail.com", "essai@mail.com", "Sujet du mail", "Texte du mail");
		return "home";
	}

	@GetMapping("/crypt")
	public String crypter() {
		System.out.println(cd.cryptage("rogerpass"));
		return "home";
	}

}
