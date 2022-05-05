import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        System.out.print("Enter the values: ");
        int[] values = new int[n];
        for (int i = 0; i < n; i++)
            values[i] = scanner.nextInt();

        if (isConsecutiveFour(values))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values){
        int count = 1;
        int temp = values[0];
        for (int i = 1; i < values.length; i++) {
            if (temp == values[i])
                count++;
            else {
                temp = values[i];
                count = 1;
            }
            if (count >= 4)
                return true;
        }
        return false;
    }
}
