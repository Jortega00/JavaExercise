public class Main {

    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        displayPattern(10);
    }
}
