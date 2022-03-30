//Write a program that prompts the user to enter the three points for p0, p1, and p2
//and displays whether p2 is on the left of the line from p0 to p1, to the right, or on the same line

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1 and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double p2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (p2 > 0)
            System.out.println("p2 is on the left side of the line");
        else if (p2 == 0)
            System.out.println("p2 is on the same line");
        else
            System.out.println("p2 is on the right side of the line");
    }
}
