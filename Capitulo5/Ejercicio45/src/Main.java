import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double n;
        double m = 0;
        double d = 0;
        int count = 0;

        do {
            n = scanner.nextDouble();
            m += n;
            d += Math.pow(n, 2);
            count++;
        } while (count < 10);

        double mean = m / 10;
        double deviation = Math.sqrt((d - (Math.pow(m, 2) / 10)) / 9);

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }
}
