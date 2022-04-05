//Write a program that prompts a student to enter a Java score. If the
//score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
//don’t pass the exam”

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int score = 0;
        do {
            System.out.print("Enter your score: ");
            score = scanner.nextInt();
            if (score >= 60)
                System.out.println("You pass the exam\n");
            else if (score > -1)
                System.out.println("You don't pass the exam\n");
        } while (score != -1);

        System.out.println("No numbers are entered except 0");
    }
}
