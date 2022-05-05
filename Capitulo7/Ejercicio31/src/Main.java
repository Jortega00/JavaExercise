import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int n1 = scanner.nextInt();
        int[] l1 = new int[n1];
        for (int i = 0; i < n1; i++)
            l1[i] = scanner.nextInt();
        System.out.print("Enter list1 size and contents: ");
        int n2 = scanner.nextInt();
        int[] l2 = new int[n2];
        for (int i = 0; i < n2; i++)
            l2[i] = scanner.nextInt();

        System.out.print("list 1 is ");
        for (int i = 0; i < n1; i++)
            System.out.print(l1[i] + " ");
        System.out.print("\nlist 2 is ");
        for (int i = 0; i < n2; i++)
            System.out.print(l2[i] + " ");

        System.out.print("\nThe merged list is ");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(merge(l1, l2)[i] + " ");
        }

    }

    public static int[] merge(int[] list1, int[] list2){
        int[] finalList = new int[list1.length + list2.length];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < finalList.length; i++) {
            if (list1.length > count1 && list2.length > count2){
                if (list1[count1] < list2[count2]) {
                    finalList[i] = list1[count1];
                    count1++;
                } else {
                    finalList[i] = list2[count2];
                    count2++;
                }
            } else {
                if (list1.length < count1) {
                    finalList[i] = list2[count2];
                    count2++;
                } else {
                    finalList[i] = list1[count1];
                    count1++;
                }
            }
        }
        return finalList;
    }
}
