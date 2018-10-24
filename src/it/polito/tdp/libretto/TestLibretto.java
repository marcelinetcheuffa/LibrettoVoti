package it.polito.tdp.libretto;

import java.util.Collections;
import java.util.Comparator;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		lib.addVoto(new Voto("Analisi",30));
		lib.addVoto(new Voto("Chimica", 28));
		lib.addVoto(new Voto("Tdp", 25));
		lib.addVoto(new Voto("Fisica", 18));
		
//		lib.stampa();
//		//System.out.println(lib.toString());
//		
//		System.out.println("Voti uguali a 25");
//		lib.stampa25();
//		
//		System.out.println("Tdp voto:");
//		System.out.println(lib.getMarkfromClass("Tdp"));
//		System.out.println("Tdp voto:");
//		System.out.println(lib.getMarkfromClass("tdp"));
//		
//		lib.addVoto(new Voto("Tdp", 25));
//		lib.addVoto(new Voto("Tdp", 27));
		
		System.out.println("Libretto");
		System.out.println(lib.toString());
		
		Libretto newLib = new Libretto(lib.getVoti());
		
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
		
		Collections.sort(newLib.getVoti(), new Comparator<Voto>() {

			@Override
			public int compare(Voto v1, Voto v2) {
				
				return -(v1.getVoto()-v2.getVoto());
			}
		});
		
		System.out.println("\nNuovo Libretto");
		System.out.println(newLib.toString());
		
	}
	
	     

	
}
