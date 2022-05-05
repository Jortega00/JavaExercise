//Write a program that reads ten
//integers, and then display the number of even numbers and odd numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scores: ");
        int[] n = new int[100];

        int count = 0;
        int temp;
        do {
            temp = scanner.nextInt();
            n[count] = temp;
            count++;
        } while (temp != 0);

        int even = 0;
        int odd = 0;
        for (int i = 0; i < count - 1; i++) {
            if (n[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("The number of odd numbers: " + odd);
        System.out.println("The number of even numbers: " + even);
    }
}
