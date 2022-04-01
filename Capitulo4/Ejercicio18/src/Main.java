//Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String chars = scanner.next();
        char letter = chars.charAt(0);
        char number = chars.charAt(1);
        int num = Integer.parseInt(String.valueOf(number)) - 1;

        String[] student = {"freshman", "sophomore", "junior", "senior"};
        String mayor = "";
        if (letter == 'I')
            mayor = "Information Management ";
        else if (letter == 'C')
            mayor = "Computer Science ";
        else if (letter == 'A')
            mayor = "Accounting ";
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println(mayor + student[num]);
    }
}
