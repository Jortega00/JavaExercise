public class Main {

    public static int getPentagonalNumber(int n){
        int r = n * (3 * n - 1) / 2;
        return r;
    }

    public static void main(String[] args){

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            count++;
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
