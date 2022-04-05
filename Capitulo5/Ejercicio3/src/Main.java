public class Main {

    public static void main(String[] args){

        System.out.println("Celsius     Fahrenheit");

        for (int i = 0; i < 101; i+=2) {
            System.out.println(i + "              " + (i * 1.8 + 32));
        }
    }
}
