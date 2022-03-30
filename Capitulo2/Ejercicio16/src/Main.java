//Write a program that prompts the user to enter the
//side of a hexagon and displays its area.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length = scanner.nextDouble();

        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("The area of the hexagon is " + df.format(area));
    }
}
