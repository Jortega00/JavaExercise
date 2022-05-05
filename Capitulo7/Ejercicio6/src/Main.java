import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        eratosthenes(50);
    }

    public static void eratosthenes(int n){
        boolean[] b = new boolean[n + 1];
        Arrays.fill(b, true);
        for (int i = 2; i < b.length; i++) {
            if (!isPrime(i))
                b[i] = false;
            if (b[i])
                System.out.println(i);
        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }
}
