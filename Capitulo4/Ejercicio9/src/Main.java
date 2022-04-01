import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String c = scanner.next();
        char uni = c.charAt(0);
        System.out.println("The Unicode for the character " + uni + " is " + (int) uni);
    }
}
