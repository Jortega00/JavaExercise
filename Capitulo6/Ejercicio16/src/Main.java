//Write a method that returns the number of days in a year

public class Main {

    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear)
            return 366;
        else
            return 365;
    }

    public static void main(String[] args){

        for (int i = 2014; i <= 2034; i++) {
            System.out.println(i + "\t\t" + numberOfDaysInAYear(i));
        }
    }
}
