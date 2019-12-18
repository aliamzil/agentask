package fr.dawan.agentask.bean;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Reponse extends DbObject {
	
	@ManyToOne
	private Sondage sondage;
	

	//private List<Integer> listrep=new ArrayList<Integer>();
	private int rep = 0;
	
	
	public Reponse(Sondage sondage, int rep) {
		super();
		this.sondage = sondage;
		this.rep = rep;
=======
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reponse {
	private int idReponse;
	private Sondage sondage;
	private List<Integer> listrep=new ArrayList<Integer>();
	public Reponse(int idReponse, Sondage sondage, List<Integer> listrep) {
		super();
		this.idReponse = idReponse;
		this.sondage = sondage;
		this.listrep = listrep;
>>>>>>> d4bb4659f96d3a5ca14c07d0405d4b4cbb337544
	}
	public Reponse() {
		super();
	}
	
}
