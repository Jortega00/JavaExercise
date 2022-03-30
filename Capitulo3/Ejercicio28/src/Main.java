//Write a program that prompts the user to enter the
//center x-, y-coordinates, width, and height of two rectangles and determines
//whether the second rectangle is inside the first or overlaps with the first

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double c1x = scanner.nextDouble();
        double c1y = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double c2x = scanner.nextDouble();
        double c2y = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double x1a = x1 / 2;
        double y1a = y1 / 2;
        double x1b = x1a * -1;
        double y1b = y1a * -1;
        double x2a = x2 / 2;
        double y2a = y2 / 2;
        double x2b = x2a * -1;
        double y2b = y2a * -1;

        double cx;
        double cy;

        if (c2x > 0)
            cx = x1a + c1x;
        else {
            cx = x1a - c1x;
            c2x *= -1;
        }

        if (c2y > 0)
            cy = y1a + c1y;
        else {
            cy = y1a - c1y;
            c2y *= -1;
        }

        if (c2x <= cx && c2y <= cy)
            if (x2a <= x1a && x2b >= x1b && y2a <= y1a && y2b >= y1b)
                System.out.println("r2 is inside r1");
            else
                System.out.println("r2 overlaps r1");
        else
            System.out.printf("r2 does not overlap r1");
    }
}
