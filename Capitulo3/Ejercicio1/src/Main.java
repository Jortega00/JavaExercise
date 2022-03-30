//Write a program that prompts the user to enter values for a, b, and c and displays
//the result based on the discriminant

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0){
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has two roots %f and %f", r1, r2);
        }else if (discriminant == 0){
            double r = (-b) / (2 * a);
            System.out.println("The equation root has one root " + r);
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
