//Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome integer

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num =scanner.nextInt();

        int newNum = num;
        if (newNum < 0)
            newNum = newNum * -1;

        int cen = newNum / 100;
        int unit = newNum % 10;

        if (newNum > 99 && newNum < 1000){
            if (cen == unit)
                System.out.println(num + " is a palindrome");
            else
                System.out.println(num + " is not a palindrome");
        } else
            System.out.println("Enter a three-digit integer");
    }
}
