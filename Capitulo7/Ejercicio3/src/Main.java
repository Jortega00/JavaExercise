//Write a program that reads the integers between
//1 and 50 and counts the occurrences of each. Assume the input ends with

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers between 1 and 50: ");
        int[] n = new int[50];
        for (int i = 0; i < 50; i++) {
            n[i] = scanner.nextInt();
            if (n[i] == 0)
                break;
        }

        int times;
        for (int i = 1; i < n.length; i++) {
            times = 0;
            for (int j = 0; j < n.length; j++) {
                if (n[j] == i)
                    times++;
            }
            if (times != 0) {
                if (times > 1)
                    System.out.printf("%d occurs %d times\n", i, times);
                else
                    System.out.printf("%d occurs %d time\n", i, times);
            }
        }
    }
}
