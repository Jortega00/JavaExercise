public class Main {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }

    public static double mersenne(int p){
        return Math.pow(2, p) - 1;
    }

    public static void main(String[] args){

        System.out.println("p\t\t2^p-1");
        for (int i = 2; i < 32; i++) {
            if (isPrime(i) && isPrime((int) mersenne(i)))
                System.out.printf("%d\t\t%.0f\n", i, mersenne(i));
        }
    }
}
