//Write a test program that prompts the user to enter a list of integers

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = scanner.nextInt();

        if (isSorted(list))
            System.out.println("The list is sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list){
        int count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] <= list[i + 1])
                count++;

        }
        return count == list.length - 1;
    }
}
