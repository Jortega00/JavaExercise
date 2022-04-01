//Write a program that receives a character
//and displays its ASCII code (an integer between 0 and 127). Here is a sample run

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String c = scanner.next();

        int ascii = c.charAt(0);

        System.out.println(ascii);
    }
}
