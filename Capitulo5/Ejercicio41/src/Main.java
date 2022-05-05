import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");

        int max = 0;
        int count = 1;
        int n1;

        do {
            n1 = scanner.nextInt();
            if (n1 > max) {
                max = n1;
                count = 1;
                continue;
            }
            if (n1 == max){
                count++;
            }
        } while (n1 != 0);

        System.out.println("Max: " + max);
        System.out.println("Count: " + count);
    }
}
