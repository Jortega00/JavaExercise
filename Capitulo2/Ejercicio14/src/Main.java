//Write a program that prompts the user to enter a weight in pounds and height in inches
// and displays the BMI. Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double kg = weight *  0.45359237;
        double mts = height * 0.0254;
        double bmi = kg / Math.pow(mts, 2);

        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("BMI is " + df.format(bmi));
    }
}
