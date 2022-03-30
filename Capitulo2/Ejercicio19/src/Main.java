import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces\n" +
                "like x1 y1 x2 y2 x3 y3: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("The area of the triangle is " + df.format(area));
    }
}
