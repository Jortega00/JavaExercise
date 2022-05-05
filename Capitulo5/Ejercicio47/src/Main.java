import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = scanner.next();

        char[] newISBN = isbn.toCharArray();
        int d;
        int d13 = 0;

        if (isbn.length() != 12){
            System.out.println(isbn + " is an invalid input");
            System.exit(0);
        }

        for (int i = 1; i < 12; i+=2) {
            d = Character.getNumericValue(newISBN[i - 1]) + (Character.getNumericValue(newISBN[i]) * 3);
            d13 += d;
        }

        int t = 10 - d13 % 10;

        if (t == 10)
            System.out.println("The ISBN-13 number is 0" + isbn + "0");
        else
            System.out.println("The ISBN-13 number is 0" + isbn + t);
    }
}
