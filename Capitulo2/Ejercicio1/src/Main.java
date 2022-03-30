//Write a program that reads a mile in a double value
//from the console, converts it to kilometers, and displays the result.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public  static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        double km = miles * 1.6;

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(miles + " miles is " + df.format(km) + " kilometers");
    }
}
