//Write a program that prompts the user to enter the minutes, and displays
// the number of years and remaining days for the minutes

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}
