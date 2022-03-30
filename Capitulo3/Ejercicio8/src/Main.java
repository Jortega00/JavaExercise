//Write a program that prompts the user to enter three integers
//and display the integers in non-decreasing order

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3){
                if (num2 > num3){
                    System.out.println(num3 + ", " + num2 + ", " + num1);
                } else {
                    System.out.println(num2 + ", " + num3 + ", " + num1);
                }
            }else {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }
        } else {
            if (num2 > num3){
                if (num1 > num3){
                    System.out.println(num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println(num1 + ", " + num3 + ", " + num2);
                }
            }else {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
        }
    }
}
