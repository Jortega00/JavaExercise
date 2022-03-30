//Write a program that reads in the length of
//sides of an equilateral triangle and computes the area and volume

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the size of the triangle: ");
        double side = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        double volume = area * side;

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("The area is " + df.format(area));
        System.out.println("The volume of the Triangular prism is " + df.format(volume));
    }
}
