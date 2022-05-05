//Write a test program that prompts the user to enter 10 numbers,
//invokes the method to reverse the numbers, and displays the numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();;
        }

        int[] list2 = reverse(list);
        for (int i = 0; i < list2.length; i++) {
            if (i == list.length - 1)
                System.out.print(list2[i] + ". ");
            else
                System.out.print(list2[i] + ", ");
        }
    }

    public static int[] reverse(int[] list) {
        int temp;
        int j = list.length - 1;
        for (int i = 0; i < list.length / 2; i++) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            j--;
        }
        return list;
    }
}
//public static int[] reverse(int[] list) {
//        int[] result = new int[list.length];
//        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//            result[j] = list[i];
//            }
//
//        return result;
//    }