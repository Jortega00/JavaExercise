//Write a program that prompts the user to enter
//a point with x- and y-coordinates and determines whether the point is inside the triangle

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point's x- and y- coordinates: ");
        double px = scanner.nextDouble();
        double py = scanner.nextDouble();

        double ax = 0;
        double ay = 0;
        double bx = 200;
        double by = 0;
        double cx = 0;
        double cy = 100;
        double dx = bx - ax;
        double dy = by - ay;
        double ex = cx - ax;
        double ey = cy - ay;

        double w1 = (ex * (ay - py) + ey * (px - ax)) / (dx * ey - dy * ex);
        double w2 = (py - ay - w1 * dy) / ey;

        if (w1 >= 0 && w2 >= 0 && (w1 + w2) <=1)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");

    }
}
