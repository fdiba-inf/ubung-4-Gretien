package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double max = 0;
        int m = input.nextInt();

        double[] numbers = new double[m];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            if(index==0){
          max = numbers[index];
        }else if(numbers[index]>max){
          max = numbers[index];
        }
        }
       
        System.out.println("Max number: " + max);

        
    }

}