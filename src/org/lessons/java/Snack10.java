package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Acquisizione dei due numeri dall'utente
        System.out.print("Inserisci il primo numero: ");
        int primoNumero = in.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondoNumero = in.nextInt();

        // Chiusura dello scanner dopo l'acquisizione
        in.close();

        // Trova il minimo e il massimo tra i due numeri
        int minimo = Math.min(primoNumero, secondoNumero);
        int massimo = Math.max(primoNumero, secondoNumero);

        // Calcolo della somma dei numeri compresi tra i due valori
        int somma = 0;
        for (int i = minimo; i <= massimo; i++) {
            somma += i;
        }

        // Stampa a video della somma
        System.out.println("La somma dei numeri compresi tra " + minimo + " e " + massimo + " è: " + somma);
    }
}
