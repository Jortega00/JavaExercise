//Write a program that simulates picking a card from a deck of 52 cards.

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int rank = random.nextInt(13);
        int suit = random.nextInt(4);

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        System.out.printf("The card you picked is %s of %s", ranks[rank], suits[suit]);
    }
}
