// Write a program that prompts the user to enter the month and year and displays the number of days in the month

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        int month = scanner.nextInt() - 1;
        int year =scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        if (month >= 0 && month <= 11){
            if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)
                System.out.println(months[month] + " " + year + " has 31 days");
            else if (month == 3 || month == 5 || month == 8 || month == 10)
                System.out.println(months[month] + " " + year + " has 30 days");
            else{
                if (isLeapYear)
                    System.out.println(months[month] + " " + year + " has 29 days");
                else
                    System.out.println(months[month] + " " + year + " has 28 days");
            }
        } else
            System.out.println("Enter a valid month");
    }
}
