package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
	 public static void main(String[] args) {
	        
	        Scanner in = new Scanner(System.in);
	        System.out.print("Inserisci una stringa: ");
	        String input = in.nextLine();
	        in.close();

	      
	        String risultato = "";
	        for (int i = 0; i < input.length(); i++) {
	            char carattere = input.charAt(i);
	            if (carattere == 'a') {
	                risultato += 'o';
	            } else if (carattere == 'o') {
	                risultato += 'a';
	            } else {
	                risultato += carattere;
	            }
	        }

	        System.out.println("La nuova stringa è: " + risultato);
	    }

}
