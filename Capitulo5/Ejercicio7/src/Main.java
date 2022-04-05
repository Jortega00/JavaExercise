//Write a program that computes the tuition in ten years and the total
//cost of four years’ worth of tuition after the tenth yea

public class Main {

    public static void main(String[] args){

        double tuition = 10000;
        for (int i = 1; i < 11; i++) {
            tuition *= 1.06;
        }
        System.out.println(tuition);
        for (int i = 1; i < 4; i++) {
            tuition *= 1.06;
            tuition += tuition;
        }
        System.out.println(tuition);
    }
}
