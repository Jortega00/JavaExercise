//Perfect number

public class Main {

    public static void main(String[] args){

        int n = 0;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    n += j;
                if (n == i && j == i - 1)
                    System.out.println(n);
            }
            n = 0;
        }
    }
}
