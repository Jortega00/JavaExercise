import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        if (isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        int count = 1;
        if (list[0] <= list[1]) {
            for (int i = 0; i < list.length; i++) {
                if (i < list.length - 1) {
                    if (list[i] <= list[i + 1])
                        count++;
                }
            }
        } else {
            for (int i = 0; i < list.length; i++) {
                if (i < list.length - 1) {
                    if (list[i] >= list[i + 1])
                        count++;
                }
            }
        }
        return count == list.length;
    }
}