package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main (String[] Args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		final int LIST = 10;
	
	Random rnd = new Random();
	
	for(int i=0; i< LIST; i++) {
		
		 String nomeCasuale = nomi[rnd.nextInt(nomi.length)];
         String cognomeCasuale = cognomi[rnd.nextInt(cognomi.length)];
		
		System.out.println((i + 1) + ". " + nomeCasuale + " " + cognomeCasuale);
		
	}
	
	}
	
	

}
