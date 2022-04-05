import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = scanner.nextInt();

        int newISBN = isbn;
        int d;
        int n = 100000000;
        int d10 = 0;

        for (int i = 1; i <= 9; i++) {
            d = isbn / n;
            isbn %= n;
            n /= 10;
            d10 += (d * i);
        }

        d10 %= 11;
        if (d10 == 10)
            System.out.println("The ISBN-10 number is 0" + newISBN + "X");
        else
            System.out.println("The ISBN-10 number is 0" + newISBN + d10);
    }
}
