public class Main {

    public static void printNumbers(int num1, int num2, int numberPerLine){
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
            count++;
            if (count == numberPerLine){
                System.out.println();
                count = 0;
            }
        }
    }

    public static void main(String[] args){

        printNumbers(1, 100, 10);
        System.out.println();
        printNumbers(100, 150, 15);
    }
}
