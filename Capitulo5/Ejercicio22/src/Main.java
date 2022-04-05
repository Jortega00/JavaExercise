//Write a program that lets the user enter the loan amount, number of years, and interest
//rate then displays the amortization schedule for the loan

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();

        double payment;
        double total;
        double mRate;
        double interest;
        double principal;
        double balance = loan;

        DecimalFormat df = new DecimalFormat("##.##");

        mRate = (rate / 12) / 100;
        payment = (loan * mRate) / (1 - (1 / Math.pow((1 + mRate), (years * 12))));
        total = payment * years * 12;
        System.out.println("Monthly Payment: " + payment);
        System.out.println("Total Payment: " + total);
        System.out.println("Payment\t\tInterest\t\tPrincipal\t\tBalance");

        for (int i = 1; i <= years * 12; i++) {
            interest = mRate * balance;
            principal = payment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t\t" + df.format(interest)
                    + "\t\t\t" + df.format(principal) + "\t\t\t" + df.format(balance));
        }

    }
}
