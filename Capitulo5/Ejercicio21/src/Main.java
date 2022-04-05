//Write a program that lets the user enter the loan amount and loan period in number of years and
//displays the monthly and total payments for each interest rate starting from 5% to
//10%, with an increment of 1/4

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        System.out.println("Interest rate     Monthly Payment       Total Payment");

        double rate = 5;
        double payment;
        double total;
        double mRate;

        DecimalFormat df = new DecimalFormat("##.##");

        while (rate <= 10){
            mRate = (rate / 12) / 100;
            payment = (loan * mRate) / (1 - (1 / Math.pow((1 + mRate), (years * 12))));
            total = payment * years * 12;
            System.out.println(rate + "%                " + df.format(payment) + "               " + df.format(total));
            rate += 0.25;
        }
    }
}
