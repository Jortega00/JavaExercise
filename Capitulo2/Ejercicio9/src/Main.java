//Write a program that prompts the user to enter the starting velocity v0 in meters/
//second, the ending velocity v1 in meters/second, and the time span t in seconds,
//then displays the average acceleration.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();

        double a = (v1 - v0) / t;
        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("The average acceleration is " + df.format(a));
    }
}
