public class Main {

    public static double computeTax(int status, double taxableIncome){
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

        if (taxableIncome <= rate10)
            tax = taxableIncome * 0.10;
        else if (taxableIncome <= rate15)
            tax = rate10 * 0.10 + (taxableIncome - rate10) * 0.15;
        else if (taxableIncome <= rate25)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (taxableIncome - rate15) * 0.25;
        else if (taxableIncome <= rate28)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (taxableIncome - rate25) * 0.28;
        else if (taxableIncome <= rate33)
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (rate28 - rate25) * 0.28 +
                    (taxableIncome - rate28) * 0.33;
        else
            tax = rate10 * 0.10 + (rate15 - rate10) * 0.15 + (rate25 - rate15) * 0.25 + (rate28 - rate25) * 0.28 +
                    (rate33 - rate28) * 0.33 + (taxableIncome - rate33) * 0.35;

        return tax;
    }

    public static void main(String[] args){

        for (int i = 50000; i <= 70000; i += 100) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i, Math.round(computeTax(0, i)),
                    Math.round(computeTax(1, i)), Math.round(computeTax(2, i)),
                    Math.round(computeTax(3, i)));
        }
    }
}
