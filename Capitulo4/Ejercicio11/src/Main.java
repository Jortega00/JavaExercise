//Write a program that prompts the user to enter binary digits
//and displays its corresponding decimal value

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary digits: ");
        int binary = scanner.nextInt();

        int b3 = binary / 1000;
        binary %= 1000;
        int b2 = binary / 100;
        binary %= 100;
        int b1 = binary / 10;
        binary %= 10;
        int b0 = binary;

        int n3 = b3 * 8;
        int n2 = b2 * 4;
        int n1 = b1 * 2;
        int n0 = b0;
        int num = n3 + n2 + n1 + n0;

        System.out.println(num);
    }
}

//        int b9 = binary / 1000000000;
//        binary %= 1000000000;
//        int b8 = binary / 100000000;
//        binary %= 100000000;
//        int b7 = binary / 10000000;
//        binary %= 10000000;
//        int b6 = binary / 1000000;
//        binary %= 1000000;
//        int b5 = binary / 100000;
//        binary %= 100000;
//        int b4 = binary / 10000;
//        binary %= 10000;

//        int n9 = b9 * 512;
//        int n8 = b8 * 256;
//        int n7 = b7 * 128;
//        int n6 = b6 * 64;
//        int n5 = b5 * 32;
//        int n4 = b4 * 16;
