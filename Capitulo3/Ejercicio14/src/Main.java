//Write a program that lets the user guess whether the flip of a coin results in heads or tails.
//The program randomly generates an integer 0 or 1, which represents head or tail.
//The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the flip of: ");
        String guess = scanner.next();

        Random random = new Random();
        int flip = random.nextInt(2);

        String answer;
        if (flip == 0)
            answer = "head";
        else
            answer = "tail";

        if (answer.contains(guess))
            System.out.println("The guess was correct");
        else
            System.out.println("The guess was incorrect");
    }
}
