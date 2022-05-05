//Write a test program that prompts the user to enter 10 numbers, invokes this
//method to return the index of the largest element, and displays the index and the element itself

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        double[] num = new double[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextDouble();
        }

        System.out.printf("%d.- %.2f",indexOfLargestElement(num), num[indexOfLargestElement(num)]);
    }

    public static int indexOfLargestElement(double[] array){
        double max = array[0];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                n = i;
            }
        }
        return n;
    }
}
