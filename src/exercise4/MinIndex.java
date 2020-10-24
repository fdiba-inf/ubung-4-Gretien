package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min = 0;
        int minimum = 0;
        int m = input.nextInt();

        double[] numbers = new double[m];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            if(index==0){
          min = numbers[index];
          minimum = index;
        }else if(numbers[index]<min){
          min = numbers[index];
          minimum = index;
        }
        }
       
        System.out.println("Min index " + minimum);

        
    }

}