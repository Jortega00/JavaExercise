//Write a program that
//shows all possible permutations or configurations of the three dice that yield the sum of nine

public class Main {

    public static void main(String[] args){

        int[] dices = new int[3];

        for (int i = 1; i <= 6; i++) {
            dices[0] = i;
            for (int j = 1; j <= 6; j++) {
                dices[1] = j;
                for (int k = 1; k <= 6; k++) {
                    dices[2] = k;
                    if ((dices[0] + dices[1] + dices[2]) == 9)
                        System.out.printf("%d %d %d\n", dices[0], dices[1], dices[2]);
                }
            }
        }
    }
}
