//Write a program that prompts the user to enter the number of students, the students’ names,
//and their scores and prints student names in decreasing order of their scores

//No terminado

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
//        int n = scanner.nextInt();
        int n = 5;
        System.out.println("Enter their names and scores: ");
        String[] names = {"a", "b", "c", "d", "e"};
        int[] scores = {10, 3, 4, 7, 8};
//        String[] names = new String[n];
//        int[] scores = new int[n];
//        for (int i = 0; i < n; i++) {
//            names[i] = scanner.next();
//            scores[i] = scanner.nextInt();
//        }

        int[] sortedScores = scores;
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[linearSearch(scores, maxSort(sortedScores)[i])];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sortedNames[i] + " " + maxSort(sortedScores)[i]);
        }
    }

    public static int[] maxSort(int[] list) {
        int[] list2 = list;
        for (int i = 0; i < list2.length - 1; i++) {
            int currentMax = list2[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list2.length; j++) {
                if (currentMax < list2[j]) {
                    currentMax = list2[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list2[currentMaxIndex] = list2[i];
                list2[i] = currentMax;
            }
        }
        return list2;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
