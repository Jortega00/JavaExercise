//Write a test program that reads three sides for a triangle and uses the isValid
//method to test if the input is valid and uses the area method to obtain the area

public class Main {

    public static boolean isValid(double side1, double side2, double side3){
        return !(side1 > (side2 + side3)) && !(side2 > (side1 + side3)) && !(side3 > (side1 + side2));
    }

    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args){

        if (isValid(3, 4, 5))
            System.out.println(area(3, 4, 5));
        else
            System.out.println("The input is invalid");
    }
}
