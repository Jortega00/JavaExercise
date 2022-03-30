//Write a program that reads the subtotal
//and the gratuity rate and then computes the gratuity and total. For example, if the
//user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
//as gratuity and $11.2 as total.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuity =  scanner.nextDouble();

        double result1 = subtotal * gratuity / 100;
        double total = result1 + subtotal;

        System.out.println("The gratuity is $" + result1 + " and total is $" + total);
    }
}
