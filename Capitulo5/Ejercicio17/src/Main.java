//Write a program that prompts the user to enter an integer from
//1 to 15 and displays a pyramid, as shown in the following sample run

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 15: ");
        int n = scanner.nextInt();

        int k = n;
        if (n < 1 || n > 15 )
            System.out.println("Invalid number");
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = k; j > 0; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= k; j++) {
                    System.out.print(j + " ");
                }
                k--;
                System.out.println();
            }
        }
    }
}