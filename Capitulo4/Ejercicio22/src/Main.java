//Write a program that prompts the user to enter two strings, and
//reports whether the second string is a substring of the first string

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.next();
        System.out.print("Enter string s2: ");
        String s2 = scanner.next();

        if (s1.contains(s2))
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
