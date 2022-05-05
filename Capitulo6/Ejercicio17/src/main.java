//Write a method that displays an n-by-n matrix

import java.util.Random;

public class main {

    public static void printMatrix(int n){
        Random random = new Random();
        int num;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = random.nextInt(2);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        printMatrix(3);
    }
}
