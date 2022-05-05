//Write a program that prompts the user to enter a credit card number as a long
//integer. Display whether the number is valid or invalid

import java.util.Scanner;

public class Main {

    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (sum) % 10 == 0 && (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 6) || prefixMatched(number, 37)) && (getSize(number) >= 13 &&
                getSize(number) <= 16);
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        int n1 = 0;
        String card = String.valueOf(number);
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            int a = Integer.parseInt(Character.toString(card.charAt(i))) * 2;
            n1 += getDigit(a);
        }
        return n1;
    }
    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        int n = number;
        if (number >= 10)
            n = (n / 10) + (n % 10);
        return n;
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int n2 = 0;
        String card = String.valueOf(number);
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            int a = Integer.parseInt(Character.toString(card.charAt(i)));
            n2 += a;
        }
        return n2;
    }
    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        String card = String.valueOf(number);
        return (card.startsWith(String.valueOf(d)));
    }
    /** Return the number of digits in d */
    public static int getSize(long d){
        String card = String.valueOf(d);
        return card.length();
    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
//    public static long getPrefix(long number, int k){}

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        String card = scanner.next();

        if (isValid(Long.parseLong(card)))
            System.out.println(card + " is valid");
        else
            System.out.println(card + " is invalid");
    }
}
