//Rewrite Programming Exercise 3.9 by entering the ISBN number as a string

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn = String.valueOf(scanner.nextInt());

        int isbn2 = Integer.parseInt(isbn);

        int newISBN = isbn2;
        int d1 = newISBN / 100000000;
        newISBN %= 100000000;
        int d2 = newISBN / 10000000;
        newISBN %= 10000000;
        int d3 = newISBN / 1000000;
        newISBN %= 1000000;
        int d4 = newISBN / 100000;
        newISBN %= 100000;
        int d5 = newISBN / 10000;
        newISBN %= 10000;
        int d6 = newISBN / 1000;
        newISBN %= 1000;
        int d7 = newISBN / 100;
        newISBN %= 100;
        int d8 = newISBN / 10;
        newISBN %= 10;
        int d9 = newISBN;

        if (d1 <= 9){
            int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
            if (d1 == 0){
                if (d10 == 10)
                    System.out.println("The ISBN-10 number is 0" + isbn + "X");
                else
                    System.out.println("The ISBN-10 number is 0" + isbn + d10);
            } else{
                if (d10 == 10)
                    System.out.println("The ISBN-10 number is " + isbn + "X");
                else
                    System.out.println("The ISBN-10 number is " + isbn + d10);
            }
        } else
            System.out.println("Enter a valid number");
    }
}
