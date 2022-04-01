//Write a program that prompts the user to enter a hex digit and
//displays its corresponding binary number. For an incorrect input, display invalid input

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hex = scanner.next();

        int n = 0;
        if (hex.equals("A"))
            n = 10;
        else if (hex.equals("B"))
            n = 11;
        else if (hex.equals("C"))
            n = 12;
        else if (hex.equals("D"))
            n = 13;
        else if (hex.equals("E"))
            n = 14;
        else if (hex.equals("F"))
            n = 15;
        else if (Integer.parseInt(hex) >= 0 && Integer.parseInt(hex) <= 9)
            n = Integer.parseInt(hex);
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        int n1 = n % 2;
        n /= 2;
        int n2 = n % 2;
        n /= 2;
        int n3 = n % 2;
        n /= 2;
        int n4 = n % 2;

        System.out.printf("The binary value is %d%d%d%d", n4, n3, n2, n1);
    }
}
