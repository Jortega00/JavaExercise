public class Main {

    public static void main(String[] args){

        double n = 0;
        for (int i = 0; i <= 30000; i++) {
            if (i > 10000)
                n += ((i - 10000) + .1);
            else if (i > 5000)
                n += ((i - 10000) * .08);
            else if (i > 0.01)
                n += (i + .06);
        }

        System.out.println(n);
    }
}
