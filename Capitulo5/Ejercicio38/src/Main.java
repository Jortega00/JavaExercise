//Write a program that prompts the user to enter a decimal
//integer and displays its corresponding octal value

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        int n;
        String o = "";
        while (num > 0){
            n = num % 8;
            num /= 8;
            o = n + o;
        }

        System.out.println(o);
    }
}
