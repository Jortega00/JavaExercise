//Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the
//left side of the line from p0 to p1, right side, the same line, or on the line segment

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double xa = scanner.nextDouble();
        double ya = scanner.nextDouble();
        double xb = scanner.nextDouble();
        double yb = scanner.nextDouble();
        double xc = scanner.nextDouble();
        double yc = scanner.nextDouble();
        
        if (onTheSameLine(xa, ya, xb, yb, xc, yc)) {
            if (onTheLineSegment(xa, ya, xb, yb, xc, yc)) {
                System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                        xc, yc, xa, ya, xb, yb);
            } else
                System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)",
                        xc, yc, xa, ya, xb, yb);
        } else {
            if (leftOfTheLine(xa, ya, xb, yb, xc, yc)){
                System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    xc, yc, xa, ya, xb, yb);
            } else {
                System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                        xc, yc, xa, ya, xb, yb);
            }
        }
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double p2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return p2 > 0;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double p2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return p2 == 0;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        return onTheSameLine(x0, y0, x1, y1, x2, y2) && y0 < y2 && y2 < y1;
    }
}
