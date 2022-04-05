public class Main {

    public static void main(String[] args){

        double n = 0;
        for (double i = 1; i <= 97; i+=2) {
            n += (i/(i + 2));
        }
        System.out.println(n);
    }
}