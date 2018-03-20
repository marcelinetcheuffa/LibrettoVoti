package it.polito.tdp.libretto;

import java.util.Collections;
import java.util.Comparator;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto lib = new Libretto() ;
		
		lib.add(new Voto("Analisi", 30));
		lib.add(new Voto("Chimica", 28));
		lib.add(new Voto("TdP", 25));
		lib.add(new Voto("Fisica", 18));

	
//		lib.stampa();
//	
//		System.out.println("Voti uguali a 25");
//		lib.stampa25() ;
//		
//		System.out.println("TdP voto:");
//		System.out.println(lib.getMarkfromClass("TdP"));
//		
//		System.out.println("TdP voto:");
//		System.out.println(lib.getMarkfromClass("tdp"));
//		
//		lib.add(new Voto("TdP", 25));
//		lib.add(new Voto("TdP", 27));
		
		System.out.println("Libretto");
		System.out.println(lib.toString());
		
		Libretto newLib = new Libretto(lib.getVoti()) ;
		
		System.out.println("\nNuovo Libretto");
		System.out.println(newLib.toString());
		
		newLib.alzaVoti();
		
		System.out.println("Libretto");
		System.out.println(lib.toString());
		
		System.out.println("\nNuovo Libretto");
		System.out.println(newLib.toString());
		
		Collections.sort(newLib.getVoti());
		
		System.out.println("\nNuovo Libretto");
		System.out.println(newLib.toString());
		
		Collections.sort(newLib.getVoti(),  new Comparator<Voto>() {

			@Override
			public int compare(Voto v1, Voto v2) {
				
				return -(v1.getVoto()-v2.getVoto());
			}
		});
		
		System.out.println("\nNuovo Libretto");
		System.out.println(newLib.toString());
		
	}

}
