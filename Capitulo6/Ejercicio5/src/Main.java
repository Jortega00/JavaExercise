//Write a test program that prompts the user to enter three numbers and invokes the
//method to display them in decreasing order

import java.util.Scanner;

public class Main {

    public static void displaySortedNumbers(double num1, double num2, double num3){
        if (num1 > num2){
            if (num2 > num3)
                System.out.println(num1 + "-" + num2 + "-" + num3);
            else if (num1 > num3)
                System.out.println(num1 + "-" + num3 + "-" + num2);
            else
                System.out.println(num3 + "-" + num1 + "-" + num2);
        } else {
            if (num1 > num3)
                System.out.println(num2 + "-" + num1 + "-" + num3);
            else if (num2 > num3)
                System.out.println(num2 + "-" + num3 + "-" + num1);
            else
                System.out.println(num3 + "-" + num2 + "-" + num1);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        displaySortedNumbers(n1, n2, n3);
    }
}
