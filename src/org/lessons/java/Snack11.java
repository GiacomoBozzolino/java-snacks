package org.lessons.java;

import java.util.Random;

public class Snack11 {

	public static void main(String[] args) {
		
		final int NUMBER = 20;
		
		Random rnd = new Random(100);
		
		// Genera array con 10 elementi casuali compresi tra 0 e 100
		int[] numbers = new int[NUMBER];
		for (int x=0;x<numbers.length;x++) {
			
			numbers[x] = rnd.nextInt(0, 101);
			System.out.println("numero[" + x + "]: " + numbers[x]);
		}
		
		// Trova il valore massimo
		int max = Integer.MIN_VALUE;
		for (int x=0;x<numbers.length;x++) {
			
			int value = numbers[x];
			if (value > max) {
				
				max = value;
			}
		}
		
		// Trova il valore minimo
		int min = Integer.MAX_VALUE;
		for (int x=0;x<numbers.length;x++) {
			
			int value = numbers[x];
			if (value < min) {
				
				min = value;
			}
		}
		
		// Trova il valore medio
		int avg = 0;
		for (int x=0;x<numbers.length;x++) {
			
			int value = numbers[x];
			avg += value;
		}
		avg /= numbers.length;
		
		// Stampa risultati
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("avg: " + avg);
		}
	}

	
	
	

