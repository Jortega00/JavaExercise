import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);

        String even = "";
        for (int i = 1; i < str.length(); i += 2) {
            even += str.charAt(i);
        }
        System.out.println(even.replace(" ", ""));
    }
}
