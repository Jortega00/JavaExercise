//Write a test program that prompts the user to enter a string and displays the sorted string

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();
        System.out.println(sort(s));
    }

    public static String sort(String s){
        char[] c = s.toCharArray();
        char temp;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (j == 0){
                    if (c[j] > c[j + 1]){
                        temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                } else if (j < c.length -1){
                    if (c[j] < c[j - 1]){
                        temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                    if (c[j] > c[j + 1]){
                        temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                } else {
                    if (c[j] < c[j - 1]){
                        temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                }
            }
        }
        String str = "";
        for (int i = 0; i < c.length; i++) {
            str += c[i];
        }
        return str;
    }
}
