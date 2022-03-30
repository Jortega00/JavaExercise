//Write a program that reads an integer between
//0 and 1000 and multiplies all the digits in the integer. For example, if an integer
//is 932, the multiplication of all its digits is 54

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 1000){
            int cen = num / 100;
            int dec = (num / 10) % 10;
            int unit = num % 10;

            int total = cen * dec * unit;
            System.out.println("The multiplication of all digits in " + num + " is " + total);
        } else {
            System.out.println("Try again with a valid number");
        }
    }
}