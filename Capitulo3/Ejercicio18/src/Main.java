//Write a program that prompts the user to enter the weight of the package and display the shipping cost.
//If the weight is greater than 20, display a message “the package cannot be shipped.”

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        double cost = 0;
        if (weight > 0 && weight <= 2){
            cost = weight * 2.5;
            System.out.println("The cost of the shipment is " + cost);
        } else if (weight > 2 && weight <= 4) {
            cost = weight * 4.5;
            System.out.println("The cost of the shipment is " + cost);
        } else if (weight > 4 && weight <= 10){
            cost = weight * 7.5;
            System.out.println("The cost of the shipment is " + cost);
        } else if (weight > 10 && weight <= 20){
            cost = weight * 10.5;
            System.out.println("The cost of the shipment is " + cost);
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
