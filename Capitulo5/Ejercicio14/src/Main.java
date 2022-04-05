//Write a program that prompts the user to enter two
//positive integers and displays the gcd

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int d;
        if (n1 < n2)
            d = n1;
        else
            d = n2;

        while (n1 % d != 0 || n2 % d != 0) {
            d--;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);

    }
}
