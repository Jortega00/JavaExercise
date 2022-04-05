//Write a program that reads an integer and displays
//all its smallest factors in an increasing order

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int x = 2;
        while (x <= n){

            if (n % x == 0) {
                n /= x;
                if (x  <= n)
                    System.out.print(x + ", ");
                else
                    System.out.print(x + ".");
            } else
                x++;
        }
    }
}
