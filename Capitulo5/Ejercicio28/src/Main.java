//Write a program that prompts the user to
//enter the year and first day of the year, then displays the first day of each month in the year

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year and day: ");
        int year = scanner.nextInt();
        int day = scanner.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + " 1, " + year + " is " + days[day]);
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9)
                day += 3;
            else if (i == 1){
                if (isLeapYear)
                    day++;
            } else
                day += 2;

            if (day >= 7)
                day %= 7;
        }
    }
}
