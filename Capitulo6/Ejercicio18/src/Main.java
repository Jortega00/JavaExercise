import java.util.Scanner;

public class Main {

    public static void CheckPassword(String password){
        char[] character = password.toCharArray();
        int digits = 0;
        boolean l = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(character[i]) || Character.isLetter(character[i]))
                l = true;
            else {
                l = false;
                break;
            }
            
            if (Character.isDigit(character[i]))
                digits++;
        }

        if (password.length() >= 10 && digits >= 3 && l){
            System.out.println("Valid Password");
        }else
            System.out.println("Invalid Password");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        CheckPassword(scanner.nextLine());
    }
}
