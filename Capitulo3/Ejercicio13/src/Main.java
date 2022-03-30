import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("0-single filer\n" +
                "1-married jointly or qualifying widow(er)\n" +
                "2-married separately\n" +
                "3-head of household\n" +
                "Enter the filing status: ");
        int status = scanner.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        double tax = 0;
        int rate10 = 0;
        int rate15 = 0;
        int rate25 = 0;
        int rate28 = 0;
        int rate33 = 0;

        switch (status){
            case 0:
                rate10 = 8350;
                rate15 = 33950;
                rate25 = 82250;
                rate28 = 171550;
                rate33 = 372950;
                break;
            case 1:
                rate10 = 16700;
                rate15 = 67900;
                rate25 = 137050;
                rate28 = 208850;
                rate33 = 372950;
                break;
            case 2:
                rate10 = 8350;
                rate15 = 33950;
                rate25 = 68525;
                rate28 = 104425;
                rate33 = 186475;
                break;
            case 3:
                rate10 = 11950;
                rate15 = 45500;
                rate25 = 117450;
                rate28 = 190200;
                rate33 = 372950;
                break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);
                break;
        }

        if (income <= rate10)
            tax = income * 0.10;
        else if (income <= rate15)
            tax = rate10 * 0.10 + (income - rate10) * 0.15;
        else if (income <= rate25)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (income - rate15) * 0.25;
        else if (income <= rate28)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (income - rate25) * 0.28;
        else if (income <= rate33)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (rate28 - rate25) * 0.28 +
                    (income - rate28) * 0.33;
        else
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (rate28 - rate25) * 0.28 +
                    (rate33 - rate28) * 0.33 + (income - rate33) * 0.35;

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}
