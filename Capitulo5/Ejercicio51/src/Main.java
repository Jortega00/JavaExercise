import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String prefix = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    prefix += str2.charAt(j);
                    break;
                }
            }
        }

        if (str1.contains(prefix) && str2.contains(prefix))
            System.out.println("The common prefix is " + prefix);
        else
            System.out.println(str1 + " and " + str2 + " have no common prefix");

    }
}
