//Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0,
//Monday is 1, . . . , and Saturday is 6). Also prompt the user to enter the number of days after
//today for a future day and display the future day of the week

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = scanner.nextInt();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (today >= 0 && today <= 6) {
            int future = (today + elapsedDays) % 7;
            System.out.println("Today is " + days[today] + " and the future day is " + days[future]);
        } else {
            System.out.println("Enter a valid day");
        }
    }
}

