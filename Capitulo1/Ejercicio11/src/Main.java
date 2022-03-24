import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

        int currentPopulation = 312032486;
        int secondsInAYear = 365 * 3600 * 24;
        int births = secondsInAYear / 7;
        int deaths = secondsInAYear / 13;
        int immigrant = secondsInAYear / 45;
        int newPopulation = births - deaths + immigrant;

//        System.out.println(currentPopulation + newPopulation);
//        System.out.println(currentPopulation + 2 * newPopulation);
//        System.out.println(currentPopulation + 3 * newPopulation);
//        System.out.println(currentPopulation + 4 * newPopulation);
//        System.out.println(currentPopulation + 5 * newPopulation);
//        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            currentPopulation = currentPopulation + newPopulation;
            System.out.println(currentPopulation);
        }
    }
}
