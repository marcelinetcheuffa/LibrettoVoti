package it.polito.tdp.libretto;

import java.time.LocalDate;

//POJO

public class Voto implements Comparable<Voto>{
	
	private String esame ;
	private int voto ;
	//private LocalDate data ;
	
	public Voto(String esame, int voto){
		this.esame = esame;
		this.voto = voto;
	}

	public String getEsame() {
		return esame;
	}

	public void setEsame(String esame) {
		this.esame = esame;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		if(voto<18 || voto>34)//|| voto>30
			throw new IllegalArgumentException("Valore non ammesso");
		this.voto = voto;
	}
	
	public String toString(){
		return esame+" "+voto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((esame == null) ? 0 : esame.hashCode());
		result = prime * result + voto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (esame == null) {
			if (other.esame != null)
				return false;
		} else if (!esame.equals(other.esame))
			return false;
		if (voto != other.voto)
			return false;
		return true;
	}

	@Override
	public int compareTo(Voto altro) {
		
		return this.esame.compareTo(altro.getEsame());
	}
	
	
	
	
}
