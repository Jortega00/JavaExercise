//Write a method that returns a random number from a list of numbers passed in the argument

import java.util.Random;

public class Main {

    public static void main(String[] args){

        int[] n = new int[10];
        for (int i = 0; i < n.length; i++)
            n[i] = i;

        System.out.println(getRandom(n));
    }

    public static int getRandom(int... numbers){
        Random random = new Random();
        int r = random.nextInt(numbers.length);
        return numbers[r];
    }
}
