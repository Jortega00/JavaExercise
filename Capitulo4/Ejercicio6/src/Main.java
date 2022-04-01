//Write a program that generates three random points on a circle centered at (0, 0)
//with radius 40 and displays three angles in a triangle formed by these three points

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random r = new Random();
        int a1 = r.nextInt(360);
        int a2 = r.nextInt(360);
        int a3 = r.nextInt(360);

        int rad = 40;
        double ar1 = Math.toRadians(a1);
        double ar2 = Math.toRadians(a2);
        double ar3 = Math.toRadians(a3);
        double x1 = rad * Math.cos(ar1);
        double y1 = rad * Math.sin(ar1);
        double x2 = rad * Math.cos(ar2);
        double y2 = rad * Math.sin(ar2);
        double x3 = rad * Math.cos(ar3);
        double y3 = rad * Math.sin(ar3);

        System.out.printf("(%.1f, %.1f)\n", x1, y1);
        System.out.printf("(%.1f, %.1f)\n", x2, y2);
        System.out.printf("(%.1f, %.1f)\n", x3, y3);
    }
}
