//Write a program that prompts the user to enter an amount (e.g., 100), the annual
//interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
//amount in the savings account after the given month

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the saving amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualRate = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double monthlyRate = (annualRate / 100) / 12;
        double total = 0;

        for (int i = 1; i <= months; i++) {
            total = (amount + total) * (1 + monthlyRate);
        }

        System.out.println(total);
    }
}
