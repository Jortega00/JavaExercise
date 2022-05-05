import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double[] x = new double[10];
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            x[i] = scanner.nextDouble();
        }

        System.out.printf("The mean is %.2f\n", mean(x));
        System.out.printf("The standard deviation is %.5f", deviation(x));

    }

    public static double deviation(double[] x){
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean(x)), 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x){
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
}
