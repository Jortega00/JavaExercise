//Assume that a vehicle plate number consists of
//three uppercase letters followed by four digits. Write a program to generate a plate number

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int letter1 = random.nextInt(91 - 65) + 65;
        int letter2 = random.nextInt(91 - 65) + 65;
        int letter3 = random.nextInt(91 - 65) + 65;
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);
        int num4 = random.nextInt(10);

        char l1 = (char) letter1;
        char l2 = (char) letter2;
        char l3 = (char) letter3;

        System.out.printf("%s%s%s-%d%d%d%d", l1, l2, l3, num1, num2, num3, num4);
    }
}
