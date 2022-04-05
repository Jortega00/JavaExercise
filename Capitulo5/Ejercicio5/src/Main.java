import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");

        int j = 20;
        DecimalFormat df = new DecimalFormat("##.##");
        for (int i = 0; i < 101; i+=2) {
            System.out.println(i + "              " + df.format(i * 1.8 + 32) + "      |      " + j +
                    "              " + df.format((j - 32) / 1.8));
            j += 5;
        }
    }
}
