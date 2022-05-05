public class Main {

    public static double poundToKilogram(double pound){
        return pound * 2.204;
    }

    public static double kilogramToPound(double kilogram){
        return kilogram * 0.453;
    }

    public static void main(String[] args){

        System.out.println("Kilogram\tPounds\t|\tPounds\t\tKilograms");

        int j = 20;
        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%d\t\t\t%.3f\t|\t%d\t\t\t%.3f\n", i, poundToKilogram(i), j, kilogramToPound(j));
            j += 5;
        }
    }
}