//Write a test program that prompts the user to enter five numbers, invokes the
//method to find the lcm of these numbers, and displays the lcm

//No terminado

public class Main {

    public static void main(String[] args){

        System.out.println(lcm(12, 15, 24));
    }

    public static int lcm(int... numbers){
        int d;
        int n = 1;
        //Ciclo para sacar los factores de cada numero
        for (int i = 0; i < numbers.length; i++) {
            d = 2;
            while (numbers[i] >= d){
                if (isPrime(d)){
                    if (numbers[i] % d == 0) {
                        numbers[i] /= d;
                        n *= d;
                    } else
                        d++;
                } else
                    d++;
            }
        }
        return n;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }
}
