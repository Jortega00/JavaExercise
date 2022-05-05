//) Write a program that prompts the user to enter 10 integers,
//and normalizes the integers to be in the range of 0 to 1

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] max = new int[10];
        for (int i = 0; i < max.length; i++)
            max[i] = scanner.nextInt();

        for (int i = 0; i < max.length; i++)
            System.out.print(normalizing(max)[i] + " ");

    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int[] normalizing(int[] array){
        int max = max(array);
        for (int i = 0; i < array.length; i++) {
            array[i] /= max;
        }
        return array;
    }
}
