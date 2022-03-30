//Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number.
//The program prompts the user to enter a three-digit number and determines whether the user wins

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int lottery = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = scanner.nextInt();

        int newLottery = lottery;
        int lotteryDigit1 = newLottery / 100;
        newLottery %= 100;
        int lotteryDigit2 = newLottery / 10;
        int lotteryDigit3 = newLottery % 10;

        int newGuess = guess;
        int guessDigit1 = newGuess / 100;
        newGuess %= 100;
        int guessDigit2 = newGuess / 10;
        int guessDigit3 = newGuess % 10;

        if (guessDigit1 > 9)
            System.out.println("Enter a three digit number");
        else{
            System.out.println("The lottery number is " + lottery);

            if (guess == lottery)
                System.out.println("Exact match: you win $12,000");
            else if ((lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2) ||
                    (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3) ||
                    (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1) ||
                    (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2) ||
                    (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1))
                System.out.println("Match all digits: you win $5,000");
            else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                    || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                    || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
                System.out.println("Match one digit: you win $2,000");
            else
                System.out.println("Sorry, no match");
        }

    }
}
