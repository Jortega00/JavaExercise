//Write a program that prompts the user to enter an integer between
//1 and 12 and then displays the name of the month that corresponds to the integer
//entered by the user

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12: ");
        int n = scanner.nextInt();

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                            "October", "November", "December"};

        System.out.println(month[n - 1]);
    }
}
