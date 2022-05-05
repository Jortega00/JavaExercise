import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int nSides = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        System.out.println("The area of the polygon is " + area(nSides, side));
    }

    public static double area(int n, double side){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
