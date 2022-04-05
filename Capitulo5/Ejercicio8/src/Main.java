//Write a program that prompts the user to enter the number
//of students and each student’s name and score, and finally displays the name of
//the student with the highest score

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = scanner.nextInt();
        System.out.print("\nEnter student's name: ");
        String name1 = scanner.next();
        System.out.print("Enter student´s score: ");
        double score1 = scanner.nextDouble();

        String maxStudent = name1;
        double maxScore = score1;

        int n = 1;
        while (num > n) {
            System.out.print("Enter student's name: ");
            String name2 = scanner.next();
            System.out.print("Enter student´s score: ");
            double score2 = scanner.nextDouble();

            if (maxScore < score2) {
                maxScore = score2;
                maxStudent = name2;
            }
            n++;
        }

        System.out.println("\n" + maxStudent + "-" + maxScore);
    }
}
