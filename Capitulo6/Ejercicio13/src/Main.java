public class Main {

    public static void series(int num1, int num2){
        double m = 0;
        for (double i = num1; i <= num2; i++) {
            m += (i / (i + 2));
            System.out.printf("%.0f\t\t%.4f\n", i, m);
        }
    }

    public static void main(String[] args){

        System.out.println("I\t\tm(i)");
        series(1, 20);
    }
}
