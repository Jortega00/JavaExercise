public class Main {

    public static double pi (int n){
        double m = 0;
        for (int i = 1; i <= n; i++) {
            m += (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return m * 4;
    }

    public static void main(String[] args){

        System.out.println("i\t\tm(i)");
        for (int i = 1; i < 1000; i += 100) {
            System.out.printf("%d\t\t%.4f\n", i, pi(i));
        }
    }
}
