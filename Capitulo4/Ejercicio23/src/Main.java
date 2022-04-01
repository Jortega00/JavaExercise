import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employees name: ");
        String name = scanner.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();

        double grossPay = rate * hours;
        double federalW = grossPay * federalTax;
        double stateW = grossPay * stateTax;

        System.out.println("\nEmployee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + rate);
        System.out.println("Gross rate: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + (federalTax * 100) + "%): $" + federalW);
        System.out.println("  State Withholding (" + (stateTax * 100) + "%): $" + stateW);
        System.out.println("  Total Deduction: $" + (federalW + stateW));
        System.out.println("Net Pay: $" + (grossPay - (federalW + stateW)));
    }
}
