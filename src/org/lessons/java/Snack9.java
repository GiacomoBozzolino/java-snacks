package org.lessons.java;
import java.util.Arrays;

public class Snack9 {
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        int[] oddArray = new int[oddCount];
        int[] evenArray = new int[evenCount];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                evenArray[evenIndex++] = arrayNum[i];
            } else {
                oddArray[oddIndex++] = arrayNum[i];
            }
        }

        System.out.println("Numeri dispari: " + Arrays.toString(oddArray));
        System.out.println("Numeri pari: " + Arrays.toString(evenArray));
    }
}



