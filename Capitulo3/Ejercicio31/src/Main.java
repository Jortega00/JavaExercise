//Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
//Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
//Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars
//or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = scanner.nextInt();

        DecimalFormat df = new DecimalFormat("##.##");
        double money;
        switch (convert){
            case 0:
                System.out.print("Enter the dollar amount: ");
                double amount = scanner.nextDouble();
                money = amount * rate;
                System.out.println("$" + amount + " is " + money + " yuan");
                break;
            case 1:
                System.out.print("Enter the dollar amount: ");
                amount = scanner.nextDouble();
                money = amount / rate;
                System.out.println(amount + " yuan is $" + df.format(money));
                break;
            default:
                System.err.println("Incorrect input");
        }
    }
}
