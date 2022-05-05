//locker puzzle

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){


        boolean[] lockers = new boolean[100];
        Arrays.fill(lockers, true);

        for (int i = 1; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += (i + 1))
                lockers[j] = !lockers[j];
        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i])
                System.out.print((i + 1) + " ");
        }
    }
}
