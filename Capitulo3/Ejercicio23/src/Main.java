//Write a program that prompts the user to enter a
//point (x, y) and checks whether the point is within the rectangle centred at (1, 1)
//with width 10 and height 5.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double x2;
        double y2;

        if (x > 0)
            x2 = 6;
        else {
            x2 = 4;
            x *= -1;
        }

        if (y > 0)
            y2 = 3.5;
        else {
            y2 = 1.5;
            y *= -1;
        }

        if (x <= x2 && y <= y2)
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", x, y);
        else
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", x, y);
    }
}
