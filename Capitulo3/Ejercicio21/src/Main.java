//Write a program that prompts the user to enter a year, month, and day of the month, and displays the
//name of the day of the week

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int q = scanner.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        }
        else if (m == 2) {
            m = 14;
            year -= 1;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println("Day of the week is " + days[h]);

    }
}
