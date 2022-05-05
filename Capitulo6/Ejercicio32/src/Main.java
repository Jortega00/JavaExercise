import java.util.Random;

public class Main {

    public static int dice1(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int dice2(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static String game(int result){
        if (result == 2 || result == 3 || result == 12)
            return "craps";
        else if (result == 7 || result == 11)
            return "natural";
        else
            return "point";
    }

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 15000; i++) {
            int dice1 = dice1();
            int dice2 = dice2();
            int result = dice1 + dice2;
            System.out.printf("\nYou rolled %d + %d = %d\n", dice1, dice2, result);

            if (game(result).equals("craps"))
                System.out.println("You lose");
            else if (game(result).equals("natural")) {
                System.out.println("You win");
                count++;
            }
            else {
                System.out.println("point is " + result);
                dice1 = dice1();
                dice2 = dice2();
                int result2 = dice1 + dice2;
                System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, result2);
                if (result == result2 || result2 == 7)
                    System.out.println("You lose");
                else {
                    System.out.println("You win");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
