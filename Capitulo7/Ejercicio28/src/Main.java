//Write a program that prompts the user to enter four integers
//and then displays all possible ways of arranging the four integers

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 integers: ");
        int[] list = new int[4];
        for (int i = 0; i < 4; i++)
            list[i] = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l)
                            System.out.printf("%d %d %d %d\n", list[i], list[j], list[k], list[l]);
                    }
                }
            }
        }
    }
}
