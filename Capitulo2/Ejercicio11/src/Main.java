//Rewrite Programming Exercise 1.11 to prompt the user
//to enter the number of years and display the population after the number of years.
//Use the hint in Programming Exercise 1.11 for this program. Here is a sample run of the program:

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        int currentPopulation = 312032486;
        int secondsInAYear = 365 * 3600 * 24;
        int births = secondsInAYear / 7;
        int deaths = secondsInAYear / 13;
        int immigrant = secondsInAYear / 45;
        int newPopulation = births - deaths + immigrant;

        System.out.println("The population in 5 years will be " + (currentPopulation + years * newPopulation));
    }
}