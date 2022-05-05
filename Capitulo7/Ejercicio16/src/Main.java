//Write a program that creates an array of numbers from 1 to 100,000,000 in ascending order

public class Main {

    public static void main(String[] args){

        long[] array = new long[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        long startTime = System.nanoTime();

//        int n1 = linearSearch(array, 1);
//        int n2 = linearSearch(array, 25000000);
//        int n3 = linearSearch(array, 50000000);
//        int n4 = linearSearch(array, 75000000);
//        int n5 = linearSearch(array, 100000000);

        int n1 = binarySearch(array, 1);
        int n2 = binarySearch(array, 25000000);
        int n3 = binarySearch(array, 50000000);
        int n4 = binarySearch(array, 75000000);
        int n5 = binarySearch(array, 100000000);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " ms");
    }

    public static int linearSearch(long[] list, long key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
            }
        return -1;
    }

    public static int binarySearch(long[] list, long key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
            low = mid + 1;
        }

        return - low - 1; // Now high < low, key not found
    }
}
