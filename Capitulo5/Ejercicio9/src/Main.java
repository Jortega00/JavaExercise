//Write a program that prompts the user to enter the number
//of students and each student’s name and score, and finally displays the names of the
//students with the lowest and second-lowest scores

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

        String minStudent1 = name1;
        double minScore1 = score1;
        String minStudent2 = "";
        double minScore2 = 0;

        int n = 1;
        while ((num) > n) {

            System.out.print("Enter student's name: ");
            String name2 = scanner.next();
            System.out.print("Enter student´s score: ");
            double score2 = scanner.nextDouble();

            if (score2 < minScore1) {
                minScore2 = minScore1;
                minStudent2 = minStudent1;
                minScore1 = score2;
                minStudent1 = name2;
//                n++;
//                continue;
            } else {
                minScore2 = score2;
                minStudent2 = name2;
//                n++;
            }

            if (score2 < minScore2 && score2 > minScore1) {
                minScore2 = score2;
                minStudent2 = name2;
            }
            n++;
        }

        System.out.println("\n" + minStudent1 + "-" + minScore1);
        System.out.println(minStudent2 + "-" + minScore2);
    }
}
