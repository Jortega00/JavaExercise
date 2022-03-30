//The program prompts the user to enter the weight and price of each
//package and displays the one with the better price.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = scanner.nextDouble();
        double price2 = scanner.nextDouble();

        double ppu1 = price1 / weight1;
        double ppu2 = price2 / weight2;

        if (ppu1 < ppu2)
            System.out.println("Package 1 has a better price");
        else if (ppu1 > ppu2)
            System.out.println("Package 2 has a better price");
        else
            System.out.println("Two packages have the same price");
    }
}
