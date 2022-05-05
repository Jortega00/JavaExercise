//Write a program that reads an unspecified number of scores and determines how many scores are above or equal
//to the average, and how many scores are below the average

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scores: ");
        int[] scores = new int[100];

        int count = 0;
        int temp = 0;
        do {
            temp = scanner.nextInt();
            scores[count] = temp;
            count++;
        } while (temp >= 0);

        int p = average(scores, count);

        int above = 0;
        int bellow = 0;
        for (int i = 0; i < count - 1; i++) {
            if (scores[i] >= p)
                above++;
            else
                bellow++;
        }

        System.out.println(above);
        System.out.println(bellow);
    }

    public static int average(int[] n, int l){
        int p = 0;
        for (int i = 0; i < l -1; i++)
            p += n[i];
        p /= (l - 1);
        return p;
    }
}
