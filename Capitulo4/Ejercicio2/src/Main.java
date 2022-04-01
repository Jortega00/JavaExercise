//Write a program that prompts the user to enter the latitude and longitude of two
//points on the earth in degrees and displays its great circle distance

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double r = 6371.01;
        double rx1 = Math.toRadians(x1);
        double ry1 = Math.toRadians(y1);
        double rx2 = Math.toRadians(x2);
        double ry2 = Math.toRadians(y2);

        double d = r * Math.acos(Math.sin(rx1) * Math.sin(rx2) + Math.cos(rx1) * Math.cos(rx2) * Math.cos(ry1 - ry2));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
