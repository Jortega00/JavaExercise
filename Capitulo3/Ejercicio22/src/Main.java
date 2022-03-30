import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance < 0)
            distance *= -1;

        if (distance < 10)
            System.out.printf("Point (%.1f, %.1f) is in the circle", x, y);
        else
            System.out.printf("Point (%.1f, %.1f) is not in the circle", x, y);
    }
}
