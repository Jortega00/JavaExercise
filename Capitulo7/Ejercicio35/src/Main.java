import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String ans = "y";

        while (ans.equals("y")){
            hangman();
            System.out.print("Do you want to guess another word? Enter y or n > ");
            ans = scanner.next();
        }
    }

    public static void hangman(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"write", "that", "program", "java"};
        int r = random.nextInt(4);
        int misses = 0;
        String s;
        char[] ans = words[r].toCharArray();
        char[] newWord = new char[words[r].length()];
        Arrays.fill(newWord, '*');
        String finalWord = "";

        while (!words[r].equals(finalWord)){
            int count = 0;
            System.out.print("(Guess) Enter a letter in word ");
            for (char value : newWord) System.out.print(value);
            System.out.print(" > ");
            s = scanner.next();

            char[] a = s.toCharArray();
            if (words[r].contains(s)){
                for (int i = 0; i < ans.length; i++) {
                    if (newWord[i] == a[0])
                        count++;
                    if (count == 0) {
                        if (ans[i] == a[0])
                            newWord[i] = a[0];
                    } else {
                        System.out.println(s + " is already in the word");
                        break;
                    }
                }
            } else {
                System.out.println(s + " is not in the word");
                misses++;
            }

            if (equals(ans, newWord)){
                for (int i = 0; i < newWord.length; i++) {
                    finalWord += newWord[i];
                }
            }
        }

        if (misses == 1)
            System.out.println("The word is " + words[r] + ". You missed " + misses + " time");
        else if (misses > 1)
            System.out.println("The word is " + words[r] + ". You missed " + misses + " times");
        else
            System.out.println("The word is " + words[r] + ". You didn't miss");
    }

    public static boolean equals(char[] ans, char[] word){
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (ans[i] == word[i])
                count++;
        }
        return count == word.length;
    }
}
