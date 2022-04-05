public class Main {

    public static void main(String[] args){

        int k = 0;
        int n = 1;
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= k; j--) {
                System.out.print("    ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.printf("%3d ", n);
                n *= 3;
            }
            for (int j = 1; j <= k + 1; j++) {
                System.out.printf(" %3d ", n);
                n /= 3;
            }
            n = 1;
            k++;
            System.out.println();
        }
    }
}
