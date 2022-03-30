//Write a program that reads the balance and the annual percentage interest rate and
//displays the interest for the next month.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance = scanner.nextDouble();
        double rate = scanner.nextDouble();

        double interest = balance * (rate / 1200);

        DecimalFormat df = new DecimalFormat("##.#####");
        System.out.println("The interest is " + df.format(interest));
    }
}