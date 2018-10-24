package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto(){
		this.voti = new ArrayList<>();
	}
	
	public Libretto(List<Voto> voti){
//		#1
		//this.voti = voti ;
		
//		#2
		//this.voti = new ArrayList<Voto>(voti);
		
//		#3
//		this.voti = new ArrayList<Voto>();
//		for(Voto v : voti){
//			this.voti.add(v);
//		}
		
//		#4
		this.voti = new ArrayList<Voto>();
		for(Voto v : voti){
			this.voti.add(new Voto(v.getEsame(), v.getVoto()));
		}
	}
	
	public void addVoto(Voto v){
		if(this.voti.contains(v)){
			System.out.println("Il voto esiste già");
			return ;
		}
		for(Voto voto: this.voti){
			if(voto.getEsame().equals(v.getEsame())){
				System.out.println("Trovato lo stesso esame (aggiorno il voto)");
				voto.setVoto(v.getVoto());
				return ;
			}
			
		}
		
		voti.add(v);
		
	}
	
	public void stampa(){
		System.out.println("Ci sono "+voti.size()+"voti\n");
		for(Voto v: voti){
			System.out.println(v);
		}
	}

	public void stampa25() {
		for(Voto v : this.voti){
			if(v.getVoto()==25)
				System.out.println(v);
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ci sono "+voti.size()+" voti\n");
		System.out.println();
		for(Voto v: voti){
			sb.append(v.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public String getMarkfromClass(String nomeCorso) {
		for(Voto v: this.voti){
			// ERRORE>MAI USARA == PER IL CONFRONTO
//			if(v.getEsame().toLowerCase() == nomeCorso.toLowerCase()){
//				return String.valueOf(v.getVoto());}
			
			// CORRETTO
			if(v.getEsame().toLowerCase().compareTo(nomeCorso.toLowerCase())==0)
				return String.valueOf(v.getVoto());
				
		}
		return "nomeCorso not found";
		
	}

	public List<Voto> getVoti() {
		return this.voti;
	}

	public void alzaVoti() {
		for(Voto v : this.voti){
			if(v.getVoto() >= 24){
				v.setVoto(v.getVoto()+2);
			} else if(v.getVoto() >= 18) {
				v.setVoto(v.getVoto()+1);
			}
		}
		
	}
	
	
}
