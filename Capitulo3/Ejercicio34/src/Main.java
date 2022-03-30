//Write a program that prompts the user to enter the three points for p0,
//p1, and p2 and displays whether p2 is on the line segment from p0 to p1.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double p2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (p2 == 0) {
            if (y0 < y2 && y2 < y1) {
                System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                        x2, y2, x0, y0, x1, y1);
            } else
                System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                        x2, y2, x0, y0, x1, y1);
        }
        else{
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
