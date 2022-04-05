//Write a program that displays all the numbers
//from 100 to 1,000, ten per line, that are divisible by 3 and 4

public class Main {

    public static void main(String[] args){

        int n = 0;
        String k;
        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                n += 1;
                if (n == 10){
                    System.out.println("");
                    n = 0;
                }
            }
        }
    }
}

