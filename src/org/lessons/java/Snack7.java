package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
	public static void main (String[] args) {
		
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il numero di secondi: ");
        int totaliSecondi = in.nextInt();
        in.close();

//     calcole le ore dai secondi 
        int ore = totaliSecondi / 3600;
//     calcolo i minuti dal resto dell'operazione precendete
        int minuti = (totaliSecondi % 3600) / 60;
//    calcolo i secondi dal resto dell'operazione precendete
        int secondi = totaliSecondi % 60;

//  String.format mi permette di formattare la stringa con zeri iniziali se necessario
        String risultato = String.format("%02d:%02d:%02d", ore, minuti, secondi);

       
        System.out.println("Il risultato è: " + risultato);
	}

}
