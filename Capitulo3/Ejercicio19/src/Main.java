//Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
//Otherwise, display that the input is invalid

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three edges of a triangle: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();

        if (edge1 > (edge2 + edge3) || edge2 > (edge1 + edge3) || edge3 > (edge1 + edge2)){
            System.out.println("Invalid input");
        } else {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        }
    }
}
