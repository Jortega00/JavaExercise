import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT).replace(" ", "");

        char[] vowels = str.toCharArray();
        int countV = 0;
        int countC = 0;

        for (int i = 0; i < str.length(); i++) {
            if (vowels[i] == 'a' || vowels[i] == 'e' ||  vowels[i] == 'o' ||  vowels[i] == 'i' ||  vowels[i] == 'u')
                countV++;
            else
                countC++;
        }

        System.out.println("The number of vowels is " + countV);
        System.out.println("The number of consonants is " + countC);
    }
}
