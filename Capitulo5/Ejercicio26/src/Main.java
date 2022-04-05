//Write a program that displays the e value for i = 10000, 20000, …, and 100000

public class Main {

    public static void main(String[] args){

        double f;
        double e = 1;
        for (double i = 1; i <= 100000; i++) {
            f = i;
            for (double j = i - 1; j >= 1; j--) {
                f *= j;
            }
            e += 1 / f;

            if (i % 10000 == 0){
                System.out.println("e at i = " + i + " is: " + e);
            }
        }
    }
}
