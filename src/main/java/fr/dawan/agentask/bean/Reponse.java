package fr.dawan.agentask.bean;

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
	}
	public Reponse() {
		super();
	}
	
}
