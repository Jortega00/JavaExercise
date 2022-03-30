//Write a program that prompts the user to enter the
//center coordinates and radii of two circles and determines whether the second
//circle is inside the first or overlaps with the first

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double c1x = scanner.nextDouble();
        double c1y = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double c2x = scanner.nextDouble();
        double c2y = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow((c2x - c1x), 2) + Math.pow((c2y - c1y), 2));

        if (distance <= (r1- r2))
            System.out.println("circle2 is inside circle1");
        else if (distance <= (r1 + r2))
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
