public class Main {

    public static double sqrt(long n){
        double lastGuess = 2;
        double nextGuess;
        while (true){
            nextGuess = (lastGuess + n / lastGuess) / 2;
            if (Math.abs(nextGuess - lastGuess) < 0.0001)
                break;
            else
                lastGuess = nextGuess;
        }
        return nextGuess;
    }

    public static void main(String[] args){

        System.out.println(sqrt(2));
        System.out.println(sqrt(9));
        System.out.println(sqrt(25));
        System.out.println(sqrt(81));
        System.out.println(sqrt(144));
    }
}
