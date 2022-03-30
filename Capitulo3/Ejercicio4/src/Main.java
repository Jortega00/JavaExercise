//Write a program that randomly generates an integer between 1
//and 12 and displays the English month names January, February, . . . , December
//for the numbers 1, 2, . . . , 12, accordingly.

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int random = r.nextInt(12) + 1;

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        System.out.println(months[random - 1]);
    }
}
