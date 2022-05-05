public class Main {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }

    public static int reverse(int number){
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

        int num = 2;
        int count1 = 0;
        int count2 = 0;
        while (count1 < 120){
            if (isPrime(num) && !isPalindrome(num)){
                if (isPrime(reverse(num))){
                    System.out.print(num + " ");
                    count1++;
                    count2++;
                }
            }
            if (count2 == 10){
                System.out.println();
                count2 = 0;
            }
            num++;
        }
    }
}
