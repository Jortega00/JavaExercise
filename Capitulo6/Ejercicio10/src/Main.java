public class Main {

        public static boolean isPrime(int number) {
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    return false; // Number is not a prime
                }
            }
            return true; // Number is prime
        }

    public static void main(String[] args){

        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
