//Write a program that prompts the user to enter an integer and
//displays whether the integer is an odd number or not

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int res = num % 2;

        if (res == 0)
            System.out.println(num + " in even number");
        else
            System.out.println(num + " is odd number");
    }
}
