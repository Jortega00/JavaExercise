public class Main {

    public static double computeCommission(double salesAmount){
        double n = 0;
        if (salesAmount <= 5000) {
            n = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            salesAmount -= 5000;
            n = (5000 * 0.08) + (salesAmount * .10);
        } else if (salesAmount > 10000) {
            n = (5000 * 0.08);
            salesAmount -= 5000;
            n += (5000 * .10);
            salesAmount -= 5000;
            n += salesAmount * .12;
        }
        return n;
    }

    public static void main(String[] args){

        System.out.println("Sales Amount\t\tCommission");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%d\t\t\t\t%.1f\n", i, computeCommission(i));
        }
    }
}
