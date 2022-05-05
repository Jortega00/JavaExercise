//Write a method that finds the number of occurrences of a specified character in a string

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int count(String str, char a){
        int count = 0;
        String word = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == a)
                count++;
        }
        return count;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string and a character: ");
        String word = scanner.nextLine();
        String letter = scanner.nextLine();

        System.out.println(count(word, letter.charAt(0)));
    }
}
