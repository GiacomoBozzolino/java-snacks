package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main (String [] Args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci una stringa:");
		
		String input = in.nextLine();
		
		in.close();
//		rimuovo gli spazzi e le maiuscole dalla stringa
		
		String noSpace= input.replaceAll("\\s", "").toLowerCase();;
		
		System.out.println(noSpace);
		
//		inverto la stringa
		 String rev = "";
		 
		 for (int i = noSpace.length() - 1; i >= 0; i--) {
	            rev = rev + noSpace.charAt(i);
	        }
		 
		 System.out.println(rev);
		 
//		 confronto tra le due stringhe
		 if(noSpace.equals(rev)) {
			 System.out.println("La frese è palindroma");
		 } else {
			 System.out.println("La frese non è palindroma");
		 }
	}

}
