import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 5 % 10);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 +"? ");
        int answer = scanner.nextInt();
        int rightAnswer = number1 * number2 * number3;

        System.out.println(number1 + " * " + number2 + " * " + number3 +" = " + answer + " is " +
                (rightAnswer == answer));
    }
}
