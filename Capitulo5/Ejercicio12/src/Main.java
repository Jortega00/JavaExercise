//Use a while loop to find the smallest
//integer n such that n3 is greater than 12,000

public class Main {

    public static void main(String[] args){

        int n = 0;
        while (Math.pow(n, 3) < 12000){
            n++;
        }
        System.out.println(n);
    }
}