//Write a program that prints the characters in
//the ASCII character table from ! to ~. Display 10 characters per line

public class Main {

    public static void main(String[] args){

        char a;
        int n = 1;
        for (int i = 33; i < 127; i++) {
            a = (char) i;
            System.out.print(a + " ");
            if (n == 10) {
                System.out.println("");
                n = 0;
            }
            n++;
        }
    }
}
