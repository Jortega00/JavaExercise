//Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy
// when converting a double value to an int value.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input as an integer whose last two digits represent the cents: ");
        int amount = scanner.nextInt();

        int dollars = amount / 100;
        int cents = amount % 100;
        int quarters = cents / 25;
        cents = cents % 25;
        int dimes = cents / 10;
        cents = cents % 10;
        int nickles = cents / 5;
        cents = cents % 5;
        int pennies = cents;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickles + " nickels");
        System.out.println(" " + pennies + " pennies");
    }
}