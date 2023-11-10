package org.lessons.java;

public class Snack6 {
	 public static void main(String[] Args) { 
		 
		String strNumber = "12345";
		int number = 0;
	     
		for (int i = 0; i < strNumber.length(); i++) {
		    char carattere = strNumber.charAt(i);
		    int valoreCarattere = carattere - '0';
		    number = number * 10 + valoreCarattere;
		}
		 
        System.out.println("Il numero convertito è: " + number);
		 
		  
	 }

}
