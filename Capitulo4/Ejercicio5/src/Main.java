//Write a program that prompts the user to enter the
//number of sides and their length of a regular polygon and displays its area

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the polygon is " + area);
    }
}
