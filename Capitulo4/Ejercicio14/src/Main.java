//Write a program that prompts the user to enter a
//letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
//1, or 0. For other input, display invalid grade

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = scanner.next();

        int n = 5;
        if (letter.equals("A"))
            n = 4;
        else if (letter.equals("B"))
            n = 3;
        else if (letter.equals("C"))
            n = 2;
        else if (letter.equals("D"))
            n = 1;
        else if (letter.equals("F"))
            n = 0;

        if (n < 5)
            System.out.println("The numeric value for grade " + letter + " is " + n);
        else
            System.out.println(letter + " is an invalid grade");
    }
}
