//Write a program that displays all the leap years, ten per line,
//from 2014 to 2114, separated by exactly one space. Also display the number of leap years in this period

public class Main {

    public static void main(String[] args){

        int count = 0;
        int n = 0;
        for (int i = 2014; i <= 2114; i++) {
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear) {
                System.out.print(i + " ");
                count++;
                n++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println("\nThere are " + n + " leap years between 2014 and 2114");
    }
}
