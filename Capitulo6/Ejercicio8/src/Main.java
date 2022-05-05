public class Main {

    public static double mileToKilometer(double mile){
        return mile * 1.60934;
    }

    public static double kilometerToMile(double kilometer){
        return kilometer / 1.60934;
    }

    public static void main(String[] args){

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

        int j = 20;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t\t\t%.3f\t|\t%d\t\t\t%.3f\n", i, mileToKilometer(i), j, kilometerToMile(j));
            j += 5;
        }
    }
}
