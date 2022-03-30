//Write a program that prompts the user to enter
//an integer and determines whether it is divisible by 4 and 5, whether it is divisible
//by 4 or 5, and whether it is divisible by 4 or 5 but not both

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        boolean both = num % 4 == 0 && num % 5 == 0;
        boolean none = num % 4 == 0 || num % 5 == 0;
        boolean one = (num % 4 != 0 && num % 5 == 0) || (num % 4 == 0 && num % 5 != 0);

        System.out.println("Is " + num + " divisible by 4 and 5? " + both);
        System.out.println("Is " + num + " divisible or 4 or 5? "+ none);
        System.out.println("Is " + num + " divisible by 4 or 5 but not both? " + one);

    }
}
