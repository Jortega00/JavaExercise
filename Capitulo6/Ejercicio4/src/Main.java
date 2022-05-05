//Write a method with the following header to display
//an integer in reverse order

public class Main {

    public static int reverse (int number){
        char[] n = String.valueOf(number).toCharArray();
        String str = "";

        for (int i = n.length - 1; i >= 0; i--) {
            str += n[i];
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args){

        System.out.println(reverse(3456));
    }
}
