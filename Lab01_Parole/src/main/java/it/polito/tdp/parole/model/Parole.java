package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private ArrayList<String> parole;
	
		
	public Parole() {
		//TODO
		this.parole =  new ArrayList<String>();
	}
	
	public void addParola(String p) {
	//TODO
		if(p!=null)
			this.parole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		ArrayList<String> risultato =  new ArrayList<String> (this.parole);
		Collections.sort(risultato, new OrdineAlfabetico());
		return risultato;
	}
	
	public void reset() {
		// TODO
		this.parole.removeAll(this.parole);
	}

}
