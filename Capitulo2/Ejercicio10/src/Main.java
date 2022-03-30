//Write a program that calculates the energy needed
//to heat water from an initial temperature to a final temperature. Your program
//should prompt the user to enter the amount of water in kilograms and the initial
//and final temperatures of the water.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double iTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fTemperature = scanner.nextDouble();

        double energy = water * (fTemperature - iTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}