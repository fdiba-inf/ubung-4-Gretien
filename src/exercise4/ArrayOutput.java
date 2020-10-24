package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p = "";
        int m = input.nextInt();

        int[] numbers = new int[m];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int index = 0; index < numbers.length; index++){
        System.out.println( p + numbers[index]);
        p = p + " ";
        }

        
    }

}