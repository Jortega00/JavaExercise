//Write a program that prompts the user to enter an amount (e.g., 10000), the annual
//percentage yield (e.g., 6.15), and the number of months (e.g., 18) and displays a
//table as shown in the sample run

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the annual percentage yield: ");
        double annualRate = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        System.out.println("Month\tCD Value");

        double total = amount;
        DecimalFormat df = new DecimalFormat("##.##");

        for (int i = 1; i <= months; i++) {
            total = amount + total* (annualRate / 1200);
            amount = total;
            System.out.println(i + "\t\t" + df.format(total));
        }

    }
}
