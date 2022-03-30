//Write a program that converts square meter into ping.
//The program prompts the user to enter a number in square meter, converts it to ping, and displays the result.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in square meters: ");
        double meters = scanner.nextDouble();
        double pings = meters * 0.3025;

        System.out.println(meters + " square meters is " + pings + " pings");
    }
}
