import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        String b = "";
        for (int i = 0; i < 8; i++) {
            b = (n & 1) + b;
            n >>= 1;
        }

        System.out.println(b);
    }
}
