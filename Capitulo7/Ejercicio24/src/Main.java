import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        String[] n = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;

        while (count1 < 1 || count2 < 1 || count3 < 1 || count4 < 1){
            int r1 = random.nextInt(13);
            int r2 = random.nextInt(4);
            if (r2 == 0) {
                count1++;
                p1 = r1;
            }
            else if (r2 == 1) {
                count2++;
                p2 = r1;
            }
            else if (r2 == 2) {
                count3++;
                p3 = r1;
            }
            else {
                count4++;
                p4 = r1;
            }
            count++;
        }

        System.out.println(n[p1] + " of " + suits[0]);
        System.out.println(n[p2] + " of " + suits[1]);
        System.out.println(n[p3] + " of " + suits[2]);
        System.out.println(n[p4] + " of " + suits[3]);
        System.out.println("Number of pics: " + count);
    }
}
