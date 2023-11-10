package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci un numero:");
		String strNumber =in.nextLine();
        int  number = Integer.valueOf(strNumber);
        
        in.close();
        
        if (number % 2 == 0) {
        	System.out.print(number);
        } else {
        	System.out.print(number + 1);
        }
	}

}
