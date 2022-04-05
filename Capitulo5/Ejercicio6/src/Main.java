import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        System.out.println("Ping     Square meter   |   Square meter     Ping");

        int j = 30;
        DecimalFormat df = new DecimalFormat("##.###");
        for (int i = 10; i < 81; i+=5) {
            System.out.println(i + "           " + df.format(i * 3.305) + "      |      " + j +
                    "            " + df.format(j / 3.305));
            j += 5;
        }
    }
}