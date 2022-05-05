//Write a method that returns a new array by eliminating the duplicate values in the array

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < eliminateDuplicates(list).length; i++) {
            System.out.print(eliminateDuplicates(list)[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] newList = new int[list.length];
        int n = 0;
        boolean duplicate;
        for (int i = 0; i < list.length; i++) {
            duplicate = false;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == newList[j])
                    duplicate = true;
            }
            if (!duplicate) {
                newList[n] = list[i];
                n++;
            }
        }

        int[] list2 = new int[n];
        for (int i = 0; i < n; i++) {
            list2[i] = newList[i];
        }
        return list2;
    }
}
