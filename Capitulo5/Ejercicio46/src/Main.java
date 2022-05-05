import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char[] letters = str.toCharArray();

        String reversed = "";
        for (int i = 0; i < letters.length; i++) {
            reversed = letters[i] + reversed;
        }

        System.out.println("The reversed string is " + reversed);
    }
}
