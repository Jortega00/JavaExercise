//Write a program that reads a number in meters, converts
//it to feet, and displays the result

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for meters: ");
        double meter = scanner.nextDouble();

        double feet = meter * 3.2786;
        System.out.println(meter + " meters is " + feet + " feet");
    }
}