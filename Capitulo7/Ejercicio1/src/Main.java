//Write a program that reads student scores, gets the best score, and then assigns grades

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        System.out.print("Enter " + n + " scores: ");
        int[] scores = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            if (max < scores[i])
                max = scores[i];
        }

        for (int i = 0; i < n; i++) {
            if (max - scores[i] <= 5)
                System.out.printf("Student %d score is %d and grade is A\n", i, scores[i]);
            else if (max - scores[i] <= 10)
                System.out.printf("Student %d score is %d and grade is B\n", i, scores[i]);
            else if (max - scores[i] <= 15)
                System.out.printf("Student %d score is %d and grade is C\n", i, scores[i]);
            else if (max - scores[i] <= 20)
                System.out.printf("Student %d score is %d and grade is D\n", i, scores[i]);
            else
                System.out.printf("Student %d score is %d and grade is F\n", i, scores[i]);
        }
    }
}
