//

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = scanner.nextDouble();

        int a1 = random.nextInt(360);
        int a3 = random.nextInt(360);
        int a4 = random.nextInt(360);
        int a5 = random.nextInt(360);

        double ar1 = Math.toRadians(a1);
        double ar3 = Math.toRadians(a3);
        double ar4 = Math.toRadians(a4);
        double ar5 = Math.toRadians(a5);

        double x1 = r * Math.cos(ar1);
        double y1 = r * Math.sin(ar1);
        double x3 = r * Math.cos(ar3);
        double y3 = r * Math.sin(ar3);
        double x4 = r * Math.cos(ar4);
        double y4 = r * Math.sin(ar4);
        double x5 = r * Math.cos(ar5);
        double y5 = r * Math.sin(ar5);

        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(0.00, %.2f)\n", r);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);
    }
}
