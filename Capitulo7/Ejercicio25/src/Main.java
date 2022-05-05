//Write a program that prompts the user to enter values for a, b, and c and displays
//the number of real roots and all real roots

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double[] eqn = new double[3];
        for (int i = 0; i < 3; i++)
            eqn[i] = scanner.nextDouble();
        double[] roots = new double[2];

        System.out.println("Real roots in the equation: " + solveQuadratic(eqn, roots));
        for (int i = 0; i < 2; i++)
            System.out.println(roots[i]);

    }

    public static int solveQuadratic(double[] eqn, double[] roots){

        double discriminant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if (discriminant > 0){
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
            return 2;
        }else if (discriminant == 0){
            roots[0] = (-eqn[1]) / (2 * eqn[0]);
            return 1;
        }else {
            return 0;
        }
    }
}
