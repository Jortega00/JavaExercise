//Programming Exercise 3.17 gives a program that plays
//the scissor-rock-paper game. Revise the program to let the user continuously play
//until either the user or the computer wins three times more than their opponent

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int answer;
        Scanner scanner = new Scanner(System.in);
        int input;

        int count1 = 0;
        int count2 = 0;

        while (true){

            answer = random.nextInt(3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            input = scanner.nextInt();

            String a;
            if (answer == 0)
                a = "scissor";
            else if (answer == 1)
                a = "rock";
            else
                a = "paper";

            String i = null;
            if (input == 0)
                i = "scissor";
            else if (input == 1)
                i = "rock";
            else if (input == 2)
                i = "paper";
            else
                System.out.println("Enter a valid option");

            if (input != answer){
                if ((input == 0 && answer == 2) || (input == 1 && answer == 0) || (input == 2 && answer == 1)) {
                    System.out.println("The computer is " + a + ". You are " + i + ". You won");
                    count1++;
                }
                else {
                    System.out.println("The computer is " + a + ". You are " + i + ". Computer won");
                    count2++;
                }
            } else
                System.out.println("The computer is " + a + ". You are " + i + " too. It is a draw");

            if (count1 - count2 == 3 || count2 - count1 == 3)
                break;
        }

        if (count1 > count2)
            System.out.println("You won " + count1 + "-" + count2);
        else if ((count1 < count2))
            System.out.println("Computer won " + count2 + "-" + count1);
        else
            System.out.println("It's a draw");
    }
}
