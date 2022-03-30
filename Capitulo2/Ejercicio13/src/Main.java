import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = scanner.nextDouble();

        double month1 = saving * (1 + 0.003125);
        double month2 = (100 + month1) * (1 + 0.003125);
        double month3 = (100 + month2) * (1 + 0.003125);
        double month4 = (100 + month3) * (1 + 0.003125);
        double month5 = (100 + month4) * (1 + 0.003125);
        double month6 = (100 + month5) * (1 + 0.003125);

        System.out.println("After the first month, the account value is " + month1);
        System.out.println("After the second month, the account value is " + month2);
        System.out.println("After the third month, the account value is " + month3);
        System.out.println("After the sixth month, the account value is " + month6);
    }
}
