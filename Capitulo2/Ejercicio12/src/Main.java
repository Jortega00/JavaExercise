//Write a program that prompts the user to enter v in meters/second (m/s) and the
//acceleration a in meters/second squared (m/s2), then, displays the minimum runway length.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("The minimum runway length for this airplane is " + df.format(length));
    }
}
