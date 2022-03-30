

public class Main {

    public static void main(String[] args){
        System.out.println("   a         b     Middle Point");
        Middle(0, 0, 2, 1);
        Middle(1, 4, 4, 2);
        Middle(2, 7, 6, 3);
        Middle(3, 9, 10, 5);
        Middle(4, 11, 12, 7);
    }

    public static void Middle(double x1, double y1, double x2, double y2){
        double m1 = (x2 + x1) / 2;
        double m2 = (y2 + y1) / 2;

        System.out.printf("(%.0f, %.0f)    (%.0f, %.0f)    (%.1f, %.1f)%n", x1, y1, x2, y2, m1, m2);
    }

}