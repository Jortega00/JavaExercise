//Write a program that prompts the user to enter
//a string, and counts and displays the number of both lowercase and uppercase vowels in the string

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        System.out.println("There are " + vowels(word) + " vowels in " + word);
    }

    public static int vowels(String word) {
        int count = 0;
        char[] letter = word.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'a' || letter[i] == 'e' || letter[i] == 'i' || letter[i] == 'o' || letter[i] == 'u')
                count++;
        }
        return count;
    }
}
