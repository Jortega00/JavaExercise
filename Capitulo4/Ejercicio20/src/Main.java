//Write a program that prompts the user to enter a string and displays its length and its last character

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string");
        String string = scanner.nextLine();
        char[] letter = string.toCharArray();

        System.out.println(string.length());
        System.out.println(letter[string.length() - 1]);
    }
}
