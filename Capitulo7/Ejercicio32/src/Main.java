//Write a test program that prompts the user to enter the size of the list and the contents of
//the list and displays the list after the partition

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = scanner.nextInt();
        System.out.print("Enter list content: ");
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = scanner.nextInt();

        System.out.println("After the partition, the list is ");
        partition(list);
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int partition(int[] list){
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;
        int temp;
        for (int i = 1; i < list.length; i++) {
            if (high == low){
                high--;
                temp = list[0];
                list[0] = list[high];
                list[high] = temp;
            }else{
                if (list[low] > pivot && list[high] > pivot)
                    high--;
                else if (list[low] > pivot && list[high] < pivot){
                    temp = list[low];
                    list[low] = list[high];
                    list[high] = temp;
                    low++;
                } else
                    low++;
            }
        }
        return high;
    }
}
