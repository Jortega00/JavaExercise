//Write a program that generates 200 random integers between
//0 and 9 and displays the count for each number

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();

        int[] counts = new int[10];
        int[] n = new int[200];
        for (int i = 0; i < 200; i++) {
            n[i] = random.nextInt(10);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 200; j++) {
                if (n[j] == i)
                    counts[i]++;
            }
            if (counts[i] > 1)
                System.out.printf("%d occurs %d times\n", i, counts[i]);
            else
                System.out.printf("%d occurs %d time\n", i, counts[i]);
        }
    }
}
