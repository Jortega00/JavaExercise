//Write a program that prompts the user to enter a temperature and a wind speed.
//The program displays the wind-chill temperature if the input is valid; otherwise, it displays
//a message indicating whether the temperature and/or wind speed is invalid.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double ta = scanner.nextDouble();


        if (ta >= -58 && ta <= 41){
            System.out.print("Enter the wind speed (> = 2) in miles per hour: ");
            double v = scanner.nextDouble();
            if (v >= 2){
                double wind = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));

                DecimalFormat df = new DecimalFormat("###.#####");
                System.out.println("The wind chill index is " + df.format(wind));
            }else{
                System.out.println("Enter a valid wind speed");
            }
        }else {
            System.out.println("Enter a valid temperature");
        }
    }
}