//Write a program that prompts the user to enter
//the length from the center of a pentagon to a vertex and computes the area of the pentagon

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();

        double s = 2 * r * Math.sin((Math.PI) / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI) / 5));

        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("The area of the pentagon is " + df.format(area));
    }
}
