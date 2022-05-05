import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int face;
        int heads = 0;
        int tails = 0;
        for (int i = 1; i <= 2000000; i++) {
            face = random.nextInt(2);
            if (face == 0)
                heads++;
            else
                tails++;
        }

        System.out.println("heads: " + heads);
        System.out.println("tails: " + tails);
    }
}
