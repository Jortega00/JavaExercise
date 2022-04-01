//Write a program that prompts the user to enter a letter and
//check whether the letter is a vowel or consonant

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.next();
        String letter2 = letter.toUpperCase(Locale.ROOT);

        int num = letter2.charAt(0);
        if (num >= 65 && num <=90){
            if (num == 65 || num == 69 || num == 73 || num == 79 || num == 85)
                System.out.println(letter + " is a vowel");
            else
                System.out.println(letter + " is a consonant");
        } else
            System.out.println(letter + " is an invalid input");
    }
}
