// Write a program that prompts the user to enter a decimal
//integer then displays its corresponding binary value

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();

        int n1 = n % 2;
        n /= 2;
        int n2 = n % 2;
        n /= 2;
        int n3 = n % 2;
        n /= 2;
        int n4 = n % 2;
        n /= 2;
        int n5 = n % 2;
        n /= 2;
        int n6 = n % 2;
        n /= 2;
        int n7 = n % 2;
        n /= 2;
        int n8 = n % 2;
        n /= 2;
        int n9 = n % 2;

        System.out.printf("The binary value is %d%d%d%d%d%d%d%d%d", n9, n8, n7, n6, n5, n4, n3, n2, n1);
    }
}
