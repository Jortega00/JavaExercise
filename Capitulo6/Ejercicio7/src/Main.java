import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        double futureInvestment = investmentAmount * Math.pow((1 + monthlyInterestRate / 1200), (years * 12));
        return futureInvestment;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Years\t\tFuture Value");

        for (int i = 1; i <= 30; i++) {
            System.out.printf("%d\t\t\t%.2f\n", i, futureInvestmentValue(amount, annualRate, i));
        }
    }
}
