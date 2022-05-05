public class Main {

    public static int reverse (int number){
        char[] n = String.valueOf(number).toCharArray();
        String str = "";

        for (int i = n.length - 1; i >= 0; i--) {
            str += n[i];
        }
        return Integer.parseInt(str);
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static void main(String[] args){

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123321));
    }
}
