//Write a program that displays a random lowercase letter using
//the Math.random() method

public class Main {

    public static void main(String[] args){

        int num = (int) (Math.random() * 27);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println(letters[num]);
    }
}
