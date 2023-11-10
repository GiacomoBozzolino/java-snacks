package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        String input = "";

        while (!input.equals("0")) {
            // Dichiaro le variabili da incrementare per il conteggio
            int caratteriAlfabetici = 0;
            int numeri = 0;
            int simboliNonAlfanumerici = 0;

            // Prendo la stringa
            System.out.print("Inserisci una stringa (inserisci 0 per terminare): ");
            input = in.nextLine();

            // Ciclo for per il conteggio, la condizione evita che 0 venga contato come numero ma chiuda solo il programma
            if (!input.equals("0")) {
                for (char carattere : input.toCharArray()) {
                    if (Character.isLetter(carattere)) {
                        caratteriAlfabetici++;
                    } else if (Character.isDigit(carattere)) {
                        numeri++;
                    } else {
                        simboliNonAlfanumerici++;
                    }
                }
                // Stampo i risultati
            
            System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
            System.out.println("Numeri: " + numeri);
            System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
        	}
                  
        }

        System.out.println("Programma terminato.");
        in.close();
    }
}
