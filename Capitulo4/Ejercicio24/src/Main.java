//Write a program that prompts the user to enter three countries and displays them in descending order

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String c1 = scanner.nextLine();
        System.out.print("Enter the second country: ");
        String c2 = scanner.nextLine();
        System.out.print("Enter the third country: ");
        String c3 = scanner.nextLine();

        char letter1 = c1.charAt(0);
        char letter2 = c2.charAt(0);
        char letter3 = c3.charAt(0);

        if (letter1 > letter2){
            if (letter2 > letter3)
                System.out.printf("The three countries in descending order are %s, %s, %s", c1, c2, c3);
            else if (letter1 > letter3)
                System.out.printf("The three countries in descending order are %s, %s, %s", c1, c3, c2);
            else
                System.out.printf("The three countries in descending order are %s, %s, %s", c3, c1, c2);
        } else{
            if (letter1 > letter3)
                System.out.printf("The three countries in descending order are %s, %s, %s", c2, c1, c3);
            else if (letter2 > letter3)
                System.out.printf("The three countries in descending order are %s, %s, %s", c2, c3, c1);
            else
                System.out.printf("The three countries in descending order are %s, %s, %s", c3, c2, c1);
        }
    }
}
