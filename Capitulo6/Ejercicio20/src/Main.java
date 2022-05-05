//Write a method that counts the number of letters in a string

public class Main {

    public static int countLetters(String s){
        int count = 0;
        char[] letters = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(letters[i]))
                count++;
        }
        return count;
    }

    public static void main(String[] args){

        System.out.println(countLetters("yo"));
        System.out.println(countLetters("java"));
        System.out.println(countLetters("arriba los pumas"));
    }

}
