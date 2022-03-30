//Write a program that displays a random coordinate in a rectangle.
//The rectangle is centred at (0, 0) with width 50 and height 150

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random r = new Random();
        int x = r.nextInt(26);
        int y = r.nextInt(76);
        boolean xr = r.nextBoolean();
        boolean yr = r.nextBoolean();

        if (xr)
            x *= -1;

        if (yr)
            y *= -1;

        System.out.printf("(%d, %d)", x, y);
    }
}
