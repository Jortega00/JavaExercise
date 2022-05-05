import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 11 integers: ");
        int[] n = new int[11];
        for (int i = 0; i < 11; i++) {
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < 11; i++) {
            if (n[i] < n[10])
                System.out.println(n[i] + " is smaller than " + n[10]);
            else if (n[i] > n[10])
                System.out.println(n[i] + " is greater than " + n[10]);
            else
                System.out.println(n[i] + " is equals than " + n[10]);
        }
    }
}
