//Use a while loop to find the largest
//integer n such that n2 is less than 12,000

public class Main {

    public static void main(String[] args){

        int n = 0;
        while (Math.pow(n, 2) < 12000){
            n++;
        }
        System.out.println(n - 1);
    }
}
