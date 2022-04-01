//Write a program that prompts the user to enter the year and the
//first three letters of a month name (with the first letter in uppercase) and displays
//the number of days in the month

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        String month = scanner.next();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days = 0;
        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
            days = 31;
        else if (month.equals("Feb")){
            if (isLeapYear)
                days = 29;
            else
                days = 28;
        }else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
            days = 30;

        if (days > 0)
            System.out.println(month  + " " + year + " has " + days + " days");
        else
            System.out.println(month + " is not a correct month name");
    }
}
