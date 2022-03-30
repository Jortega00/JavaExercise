//Write a program that plays the popular scissor–rock–paper game

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int answer = random.nextInt(3);
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int input = scanner.nextInt();

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
            if ((input == 0 && answer == 2) || (input == 1 && answer == 0) || (input == 2 && answer == 1))
                System.out.println("The computer is " + a + ". You are " + i + ". You won");
            else
                System.out.println("The computer is " + a + ". You are " + i + ". Computer won");
        } else
            System.out.println("The computer is " + a + ". You are " + i + " too. It is a draw");

    }
}
