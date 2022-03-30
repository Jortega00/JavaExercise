//Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
//Revise the program to randomly generate a multiplication question with two integers less than 1000.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random r = new Random();
        int number1 = r.nextInt(1000);
        int number2 = r.nextInt(1000);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " − " + number2 + "? ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if ((number1 - number2) == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " − " + number2 + " should be " + (number1 - number2));
            }
    }
}
