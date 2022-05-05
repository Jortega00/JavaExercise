//Write a test program that prompts the user to enter ten numbers, invokes this
//method to return the maximum value, and displays the maximum value

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] num = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextDouble();
        }
        System.out.println(max(num));
    }

    public static double max(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
