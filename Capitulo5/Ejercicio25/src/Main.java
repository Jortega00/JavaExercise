public class Main {

    public static void main(String[] args){

        double n = 0;
        for (double i = 1; i <= 100000 ; i++) {
            n += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i % 10000 == 0){
                System.out.println("PI when i = " + i + " is: " + (n * 4));
            }
        }
    }
}
