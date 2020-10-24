package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        char[] letters = new char[m];

        System.out.println("Enter letters: ");
        for (int index = m - 1; index >= 0; index--) {
            letters[index] = input.next().charAt(0);
        }

        String symbolsAsString = Arrays.toString(letters);
        System.out.println("Reversed symbols: " + symbolsAsString);
    }

}