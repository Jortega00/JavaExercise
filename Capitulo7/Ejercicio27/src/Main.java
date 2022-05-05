//Write a test program that prompts the user to enter a list of integers and check whether
//the array is sorted with constant interval

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
            System.out.println("The list is sorted with a constant interval");
        else
            System.out.println("The list is not sorted with a constant interval");
    }

    public static boolean isSorted(int[] list){
        int count = 0;
        int dif = list[1] - list[0];
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] < list[i + 1] && (list[i + 1] - list[i] == dif))
                count++;

        }
        return count == list.length - 1;
    }
}
