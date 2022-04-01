//Write a program that prompts the user to enter the side of a hexagon and displays its area

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("The area of the hexagon is " + df.format(area));
    }
}
