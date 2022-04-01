//Write a program that prompts the user to enter a lowercase or uppercase letter and
//displays its corresponding number

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.next();
        String letter2 = letter.toLowerCase(Locale.ROOT);

        int n = 0;
        if (letter2.equals("a") || letter2.equals("b") || letter2.equals("c"))
            n = 2;
        else  if (letter2.equals("d") || letter2.equals("e") || letter2.equals("f"))
            n = 3;
        else if (letter2.equals("g") || letter2.equals("h") || letter2.equals("i"))
            n = 4;
        else  if (letter2.equals("j") || letter2.equals("k") || letter2.equals("l"))
            n = 5;
        else if (letter2.equals("m") || letter2.equals("n") || letter2.equals("o"))
            n = 6;
        else  if (letter2.equals("p") || letter2.equals("q") || letter2.equals("r") || letter2.equals("s"))
            n = 7;
        else if (letter2.equals("t") || letter2.equals("u") || letter2.equals("v"))
            n = 8;
        else  if (letter2.equals("w") || letter2.equals("x") || letter2.equals("y") || letter2.equals("z"))
            n = 9;

        if (n > 0)
            System.out.println("The corresponding number is " + n);
        else
            System.out.println(letter + " is an invalid input");
    }
}
