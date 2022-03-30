//Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using singular words for single
//units such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if (dollars > 1)
            System.out.println(" " + dollars + " dollars");
        else if (dollars == 1)
            System.out.println(" " + dollars + " dollar");
        else
            System.out.print("");

        if (quarters > 1)
            System.out.println(" " + quarters + " quarters");
        else if (quarters == 1)
            System.out.println(" " + quarters + " quarter");
        else
            System.out.print("");

        if (dimes > 1)
            System.out.println(" " + dimes + " dimes");
        else if (dimes == 1)
            System.out.println(" " + dimes + " dime");
        else
            System.out.print("");

        if (nickels > 1)
            System.out.println(" " + nickels + " nickels");
        else if (nickels == 1)
            System.out.println(" " + nickels + " nickel");
        else
            System.out.print("");

        if (pennies > 1)
            System.out.println(" " + pennies + " pennies");
        else if (pennies == 1)
            System.out.println(" " + pennies + " penny");
        else
            System.out.print("");
    }
}
