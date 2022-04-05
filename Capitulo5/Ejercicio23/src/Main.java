//Write a program that compares the results of the summation of the preceding series,
//computing from left to right and from right to left with n = 50000.

public class Main {

    public static void main(String[] args){

        double n = 0;
        for (double i = 1; i <= 50000; i++) {
            n += (1/i);
        }
        System.out.println(n);
    }
}
