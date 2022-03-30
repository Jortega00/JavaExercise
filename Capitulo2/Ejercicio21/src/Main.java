//Write a program that reads in investment amount, annual interest rate, and number of years and displays
//the future investment value

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the invesment amount: ");
        double investment = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        double years = scanner.nextDouble();

        double futureInvestment = investment * Math.pow((1 + rate / 1200), (years * 12));

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Future value is $" + df.format(futureInvestment));
    }
}
